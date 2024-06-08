package com.simplilearn;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UserValidatorTest {
	
	UserValidator validator = new UserValidator();
	
	@Test
	void validUsername() {
		assertTrue(validator.isValidUsername("ValidUsr"), "username should be valid");
	}
	
	@Test
	void usernameTooShort() {
		assertFalse(validator.isValidUsername("User"), "Username too short to  be valid");
	}
	
	@Test
	void usernameWithSpace() {
		assertFalse(validator.isValidUsername("Invalid User"),"Username with space should be invalid");
	}

	@Test
	void usernameIsNull() {
		assertFalse(validator.isValidUsername(null),"Null username should be invalid");
	}
}

//END UserValidatorTest