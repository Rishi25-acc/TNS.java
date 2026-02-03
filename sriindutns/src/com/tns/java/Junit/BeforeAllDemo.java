package com.tns.java.Junit;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

class BeforeAllDemo {

	@BeforeAll
        static void beforeAll() {
		    System.out.println("Before ALL test methods");
	}
	
	@Test
	void testOne() {
		System.out.println("Executing Test One");
	}
	
	
	@Test
	void testTwo() {
		System.out.println("Executing Test Two");
	}

}
