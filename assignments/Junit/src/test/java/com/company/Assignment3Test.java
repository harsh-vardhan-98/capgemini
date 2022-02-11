package com.company;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Assignment3Test {
	BankBalance b;
	
	@BeforeEach 
	void init() {
		b = new BankBalance(2000);
	}
	
	
	@Test
	@DisplayName("checking withdraw exception")
	void withdrawTest() {	
		assertThrows(InsufficentFundsException.class , ()->b.withdraw(1000),"check condition once ");
		
	}

}
