package com.learning.java.features.java8.streams;

import com.learning.java.features.model.UserDetails;
import com.learning.java.features.model.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodsUsage {
    public List<UserDetails> getNLUsers() {
        return filterBasedOnCountry();
    }

    public List<String> getNLUserNames() {
        return filterBasedOnCountryReturnUserName();
    }

    public List<String> getListOfFlatMapUserNames() {
        return getListOfAllUserNames();

    }

    private List<UserDetails> filterBasedOnCountry() {
        return Utils.getUserDetails().stream().filter(userDetail -> userDetail.getCountry()
                .equalsIgnoreCase("NL")).collect(Collectors.toList());
    }

    private List<String> filterBasedOnCountryReturnUserName() {
        return Utils.getUserDetails().stream().filter(userDetail -> userDetail.getCountry()
                .equalsIgnoreCase("NL"))
                .map(user -> user.getName())
                .collect(Collectors.toList());
    }

    private List<String> getListOfAllUserNames() {

        List<List<UserDetails>> listOfUsers = new ArrayList<>();
        listOfUsers.add(Utils.getUserDetails());
        listOfUsers.add(Utils.getIndUserDetails());

        //return listOfUsers.stream().flatMap(userDetails -> userDetails.stream().map(user -> user.getName())).collect(Collectors.toList());
        return listOfUsers.stream().flatMap(userDetails -> userDetails.stream()
                .filter(user ->user.getCountry().equalsIgnoreCase("FR"))
                .map(filterUser -> filterUser.getName())).collect(Collectors.toList());
    }
}
