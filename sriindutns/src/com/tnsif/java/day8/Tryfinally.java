package com.tnsif.java.day8;

public class Tryfinally {
	public static void main(String[]args) {
		try {
			int p=110;
			int n=0;
			int r=p/n;
			System.out.print(r);
		}
		finally {
			System.out.print("Output isn't occured");
		}
	}

}
