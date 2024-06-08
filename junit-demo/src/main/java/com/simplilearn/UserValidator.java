package com.simplilearn;

public class UserValidator {
	public boolean isValidUsername(String username) {
		return username != null && username.length() >= 6 && !username.contains(" ");
	}
}
