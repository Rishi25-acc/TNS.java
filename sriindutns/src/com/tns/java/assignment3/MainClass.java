package com.tns.java.assignment3;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER ACCOUNT.NO");
		String Accno = sc.nextLine();
		
		System.out.println("ENTER NAME");
		String Name = sc.nextLine();
		
		System.out.println("ENTER BALANCE");
		int Balance = sc.nextInt();
		
		
		
	
		
		System.out.println("ACCOUNT.N0:"+Accno);
		System.out.println("NAME:"+Name);
		System.out.println("BALANCE"+Balance);
		sc.close();
		
	}
	
}
