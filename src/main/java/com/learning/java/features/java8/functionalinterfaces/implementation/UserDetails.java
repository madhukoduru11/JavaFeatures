package com.learning.java.features.java8.functionalinterfaces.implementation;

import com.learning.java.features.java8.functionalinterfaces.interfaces.AddCalculation;

public class UserDetails {


    public String getUserFullName(String name, AddCalculation addCalculation) {
        return addCalculation.adding(name);
    }
}
