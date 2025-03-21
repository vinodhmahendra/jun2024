package com.simplilearn.annotations;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OneTimeSetup {
	@BeforeAll
	static void initAll() {
		System.out.println("Initializing once before all tests");
	}
	
	@AfterAll
	static void cleanUpAll() {
		System.out.println("Cleaning up after  all tests.");
	}
	
	@Test
	void testMethodOne() {
		System.out.println("Running testMethodOne.");
	}

}

//END
