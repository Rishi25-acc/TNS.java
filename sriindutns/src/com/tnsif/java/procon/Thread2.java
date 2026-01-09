package com.tnsif.java.procon;

public class Thread2 extends Thread {
	ThreadDemo obj;
	
	Thread2(ThreadDemo obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		for(int b=2;b<6;b++)
		{
			obj.receiver();
		}
	}
	
}
