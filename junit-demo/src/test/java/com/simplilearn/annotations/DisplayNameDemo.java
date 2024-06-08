package com.simplilearn.annotations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Human readable test name")
public class DisplayNameDemo {

	@Test
	@DisplayName("custom test  name containing spaces")
	void testWithCustomNameContainingSpaces() {
		
	}
}
