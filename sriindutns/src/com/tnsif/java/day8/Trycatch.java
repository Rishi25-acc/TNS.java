package com.tnsif.java.day8;

public class Trycatch {
	public static void main(String[]args) {
	try {
		int a=50;
		int c=0;
		int b=a/c;
		System.out.println(b);
	}
	catch(Exception e) {
		System.out.print("Underfined");
	}
	}

}
