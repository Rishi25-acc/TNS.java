package com.tns.java.Junit;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.Test;

class AfterEachDemo {

	@Test
	void testone() {
		System.out.println("Executing Test One");
	}
	
	
	@Test
	void testTwo() {
		System.out.println("executing Test Two");
	}
	
	
	@AfterEach
	void afterEach() {
		System.out.println("After EACH test method");
	}

}
