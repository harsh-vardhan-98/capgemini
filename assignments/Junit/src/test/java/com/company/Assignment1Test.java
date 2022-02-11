package com.company;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Assignment1Test {
	
	MinMaxFinder m;
	
	@BeforeEach
	public void init() {
		int arr[] = {2,4,1,5,10};
		m = new MinMaxFinder(arr);
		
	}
	
	@Test
	@DisplayName("for min and max  Test")
	void minMaxtest() {
		int [] desire = {1,10};
		int [] actual = m.minMax();
		assertArrayEquals(desire,actual,"Two arrays are perfectly equal");
	}
	
	
	@Test
	@DisplayName("for minimum Test")
	void minTest() {
		int desire = 1;
		int actual = m.min();
		assertEquals(desire,actual);
	}

	@Test
	@DisplayName("for maximum Test")
	void maxTest() {
		int desire = 10;
		int actual = m.max();
		assertEquals(desire,actual);
	}
}
