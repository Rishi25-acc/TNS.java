package com.tnsif.java.day4;

public class Super {
	int a=10;
	public void show() {
		
	}

}
class nani extends Super{
	int a = 20;
	public void display() {
		System.out.println("LOCAL:"+a);
		System.out.println("INSTANCE:"+super.a);
	}
}