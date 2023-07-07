package com.learning.java.features.java8.functionalinterfaces.implementation;

import com.learning.java.features.java8.functionalinterfaces.interfaces.AddCalculation;

public class UserDetails {

    AddCalculation calculation = value -> value + " if fine and waiting for your";
    public String getUserFullName(String name, AddCalculation addCalculation) {
        return addCalculation.adding(name);
    }

    public AddCalculation message() {
        return calculation;
    }


}
