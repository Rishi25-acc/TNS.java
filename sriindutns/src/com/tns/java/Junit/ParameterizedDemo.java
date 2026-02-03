package com.tns.java.Junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class ParameterizedDemo {

	@ParameterizedTest
	@ValueSource(strings= {"CAN","VAN","TAN"})
			
	void endsWithN(Sring str) {
		assertTrue(str.endsWith("N"));
		
	}
	
	private void assertTrue(boolean endsWith) {
	
	}

}
