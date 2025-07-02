package com.example.HibernateValidator;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.example.HibernateValidator.Model.HibernateValidator;

public class ValidatorExample {

	// Main Method
	public static void main(String[] args) {

		// Create a validator factory and validator
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();

		// **Check for invalid user data**
		System.out.println("Checking for invalid user data...");
		System.out.println("-----------------------------------");

		// Create an invalid user object with various errors
		HibernateValidator invalidUser = new HibernateValidator(null, "a", "test123", 12456, "Javatechnology", "db", "",
				"1234", "y", -2, 1, new Date(), getPastOrFutureDate(-2), getPastOrFutureDate(2), 5, "sample1.com",
				"123@");

		Set<ConstraintViolation<HibernateValidator>> violations = validator.validate(invalidUser);

		if (violations.isEmpty()) {
			System.out.println("Valid user data provided.");
		} else {
			System.out.println("Invalid user data found:");
			for (ConstraintViolation<HibernateValidator> violation : violations) {
				System.out.println(violation.getMessage());
			}
		}

		System.out.println("-----------------------------------");
		System.out.println();

		// **Check for valid user data**
		System.out.println("Checking for valid user data...");
		System.out.println("-----------------------------------");

		// Create a valid user object
		HibernateValidator validUser = new HibernateValidator(1L, "geekauthor", "geeka@gmail.com", 16, "4", "3", "ML",
				null, "YN", 2, 0, getPastOrFutureDate(2), getPastOrFutureDate(1), getPastOrFutureDate(-2), 2,
				"https://www.geeksforgeeks.org/", "6011111111111117");

		violations = validator.validate(validUser);

		if (violations.isEmpty()) {
			System.out.println("Valid user data provided.");
		} else {
			System.out.println("Invalid user data found:");
			for (ConstraintViolation<HibernateValidator> violation : violations) {
				System.out.println(violation.getMessage());
			}
		}

		System.out.println("-----------------------------------");
	}

	// Utility method to generate past or future dates
	public static Date getPastOrFutureDate(int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.DATE, days);
		return calendar.getTime();
	}
}
