package com.simplilearn.annotations;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//@BeforeEach

//@AfterEach
public class SetupTeardownTests {
	
	@BeforeEach
	void setUp() {
		System.out.println("setting up.");
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("Tearing down.");
	}
	
	
	@Test
	public void testMethodOne() {
		System.out.println("Running testMethodOne.");
	}
	
	@Test
	public void testMethodTwo() {
		System.out.println("Running testMethodTwo.");
	}

}

//END