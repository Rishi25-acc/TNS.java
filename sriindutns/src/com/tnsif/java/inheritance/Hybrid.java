package com.tnsif.java.inheritance;

public class Hybrid {
	public void show1()
	{
		System.out.println("A");
	}

}
class ramu extends Hybrid {
	public void show2() 
	{
		System.out.println("B");
	}
}
class raju extends ramu{
	public void show3() 
	{
		System.out.println("C");
	}
}
class ram extends Hybrid{
	public void show4() 
	{
		System.out.println("D");
	}
}
class raj extends ram{
	public void show5() 
	{
		System.out.println("E");
	}
}
class bro extends ram{
	public void show6() 
	{
		System.out.println("F");
	}
}