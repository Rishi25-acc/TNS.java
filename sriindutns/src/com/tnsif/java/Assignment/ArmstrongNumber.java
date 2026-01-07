package com.tnsif.java.Assignment;
 
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a number:");
		int number = sc.nextInt();
		
		int originalNumber = number;
		int sum = 0;
		int digits = 0;
		int temp = number;
		while(temp!=0) {
			digits++;
			temp /=10;
			
		}
		
		temp = number;
		while(temp!=0) {
			int digit = temp%10;
			sum+= Math.pow(digit,  digits);
			temp /= 10;
		}
		
		if (sum == originalNumber) {
			System.out.println(originalNumber + "is an Armstrong number.");
		}else {
			System.out.println(originalNumber + "is not an Armstrong number.");
	}
    sc.close();
}
}
