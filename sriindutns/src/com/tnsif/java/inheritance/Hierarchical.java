package com.tnsif.java.inheritance;

public class Hierarchical {
	public void show1()
	{
		System.out.println("A");
	}
}
class A extends Hierarchical
{
	public void show2()
	{
		System.out.println("B");
	}
}
class B extends Hierarchical 
{
	public void show3()
	{
		System.out.println("C");
	}
}