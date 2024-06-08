package com.simplilearn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class EmailValidatorTest {
	
	private final EmailValidator validator = new EmailValidator();
	
	@ParameterizedTest
	@CsvSource({
		"alice@example.com, true",
		"vinodh.mahendra@gmail.com,true",
		"chushruth,true"
	})
	void testIsValidEmail(String email,boolean expected) {
		assertEquals(expected, validator.isValidEmail(email),
				"Email validation failed for : " + email);
	}

}
