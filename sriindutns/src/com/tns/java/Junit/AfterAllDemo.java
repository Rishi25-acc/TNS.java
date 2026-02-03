package com.tns.java.Junit;


import org.junit.Test;
import org.junit.jupiter.api.AfterAll;

class AfterAllDemo {

	@Test
	void testOne() {
		System.out.println("Executing Test One");
	}
    
	
	@Test
	void testTwo() {
		System.out.println("Executing Test Two");
	}
	
	@AfterAll
	  static void afterAll() {
		System.out.println("After ALL test methods");
	}
	
	
}   
