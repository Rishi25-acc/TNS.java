package com.tnsif.java.day7;

public class StringDemo {
	public static void main(String[] args) {
		String S = new String("rishi");
		String S1 = new String("rishi");
		System.out.println("hello:"+S.toUpperCase());
		System.out.println("NAME:"+S1.toUpperCase());
		System.out.println(S.charAt(3));
		System.out.println(S1.contentEquals(S));
		
	}

}
