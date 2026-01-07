package com.tnsif.java.day8;

public class throwdemo {
	public static void main(String[]args) {
		int age= 18;
		if(age>18) {
			System.out.println("ELIGIBLE TO DRIVE");
			
		}
		else {
			throw new ArithmeticException("NOT ELIGIBLE TO DRIVE");
		}
	}

}
