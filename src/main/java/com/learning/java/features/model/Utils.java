package com.learning.java.features.model;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<UserDetails> getUserDetails() {
        List<UserDetails> userDetailsList = new ArrayList<>();
        userDetailsList.add(new UserDetails("Erik", "NL", 12, "Mortgages"));
        userDetailsList.add(new UserDetails("Guus", "SP", 32, "IT"));
        userDetailsList.add(new UserDetails("Michel", "NL", 9, "PO"));
        userDetailsList.add(new UserDetails("Anuik", "FR", 12, "BO"));
        userDetailsList.add(new UserDetails("Madhu", "IND", 11, "IT"));

        return userDetailsList;
    }

    public static List<UserDetails> getIndUserDetails() {
        List<UserDetails> userDetailsList = new ArrayList<>();
        userDetailsList.add(new UserDetails("Erik1", "NL", 12, "Mortgages"));
        userDetailsList.add(new UserDetails("Guus2", "SP", 32, "IT"));
        userDetailsList.add(new UserDetails("Michel3", "NL", 9, "PO"));
        userDetailsList.add(new UserDetails("Anuik4", "FR", 12, "BO"));
        userDetailsList.add(new UserDetails("Madhu6", "IND", 11, "IT"));

        return userDetailsList;
    }
}
