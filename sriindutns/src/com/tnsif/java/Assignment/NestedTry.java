package com.tnsif.java.Assignment;

public class NestedTry { 
	public static void main(String []args) {
		try {
			int a = 4;
			int b = 0;
			int c = a/b;
			System.out.println(c);
			
			
			try {
				int[] arr= {0,1,2,3};
				System.out.println(arr[2]);
				System.out.println(arr[4]);
			}
			
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("bye");
			}
		}
		
		catch(ArithmeticException e) {
			System.out.println("hii");
		}
	}

}
