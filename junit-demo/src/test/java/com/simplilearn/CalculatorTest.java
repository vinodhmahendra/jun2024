package com.simplilearn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator calculator;
	
	
	@BeforeEach
	public void setUp() {
		calculator = new Calculator();
	}
	
	
	@Test
	public void addingSevenAndThreeShouldYieldTen() {
		
		assertEquals(10, calculator.add(7, 3));
		
	}
	
	@Test
	public void subtractingThreeFromSevenShouldYieldFour() {
		
		assertEquals(4, calculator.subtract(7,3));
	}

}
