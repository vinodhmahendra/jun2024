package com.simplilearn;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ArrayComparisonTest {
	
	@Test
	void testIntegerArrayEquality() {
		int[] expected = {1,2,3,4,5};
		int[] actual = {1,2,3,4,5};
		assertArrayEquals(expected, actual,"The integer arrays should be equal");
	}
	
	@Test
	void testStringArrayEquality() {
		String[] expected = {"hello","world"};
		String[] actual = {"hello","world"};
		assertArrayEquals(expected, actual,"The string arrays should be equal");
	}
	
	@Test
	void testArrayEqualityWithDifferentOrder() {
		int[] expected = {1,2,3,4,5};
		int[] actual = {5,4,3,2,1};
		assertArrayEquals(expected, actual,"The integer arrays should not be equal since the order is different ");
	}

}

//END Array Comparision Test
