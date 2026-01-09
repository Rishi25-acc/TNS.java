package com.tnsif.java.procon;

public class ThreadDemo {
	int i;
	boolean flag=false;
	
	synchronized void deliver(int i)
	{
		if (flag)
			try {
				wait();
			}
		catch(Exception e)
		{
			System.err.println(e);
		}
		this.i=i;
		flag=true;
		System.out.println("the msg is delivered"+i);
		notify();
	}
	synchronized int receiver()
	{
		if(!flag)
			try {
				wait();
			}catch(Exception e)
		{
				System.err.println(e);
		}
	System.out.println("The msg is received"+i);
	flag=false;
	notify();
	return i;
	}

}
