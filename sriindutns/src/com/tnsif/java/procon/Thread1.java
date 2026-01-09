package com.tnsif.java.procon;

public class Thread1 extends Thread{
	ThreadDemo obj;
	
	Thread1(ThreadDemo obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		for(int a=2;a<6;a++)
		{
			obj.deliver(a);
		}
	}
	

}
