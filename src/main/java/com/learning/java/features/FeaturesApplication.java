package com.learning.java.features;

import com.learning.java.features.java8.functionalinterfaces.implementation.UserDetails;
import com.learning.java.features.java8.functionalinterfaces.interfaces.AddCalculation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FeaturesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeaturesApplication.class, args);
		AddCalculation calculation = name -> name.toUpperCase() + " KODURU";
		System.out.println(new UserDetails().getUserFullName("Madhusudhanarao", calculation));

		System.out.println(new UserDetails().message().adding("Madhu"));
	}

}
