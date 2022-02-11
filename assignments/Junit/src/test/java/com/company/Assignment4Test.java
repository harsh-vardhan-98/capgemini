package com.company;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Assignment4Test {

	@BeforeAll
	public static void  testbefore() {
		System.out.println("beforeall anotation");
	}
	
	
	@BeforeEach
	void init() {
		System.out.println("before each block");
	}

	@AfterEach
	void end() {
		System.out.println("After each block");
	}
	
	
	@Test
	void test() {
		System.out.println("Hello world");
		fail("fail happened");
	}
	
	@AfterAll
	static void testend() {
		System.out.println("afterall anotation");
	}

}
