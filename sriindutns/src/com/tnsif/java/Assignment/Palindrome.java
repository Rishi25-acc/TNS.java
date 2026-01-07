package com.tnsif.java.Assignment;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int num, originalNum, reverse = 0, digit;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num = sc.nextInt();
		
		originalNum = num;
		
		while(num!=0) {
			digit = num%10;
			reverse = reverse*10+digit;
			num=num/10;
			
		}
		
		if (originalNum == reverse) {
			System.out.println("The number is a Palindrome");
			}else {
				System.out.println("The number is NOT a Palindrome");
			}
		}
}
