package com.tnsif.java.inheritance;

public class multiple {
	public void show1()
	{
		System.out.println("A");
	}
}
class pooja extends multiple
{
	public void show2()
	{
		System.out.println("B");
	}
}
class sadie extends pooja
{
	public void show3()
	{
		System.out.println("C");
	}
}