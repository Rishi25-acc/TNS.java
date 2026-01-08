package com.tnsif.java.day9;

public class multiThreads extends Thread {
	public void run()
	{
		try {
			System.out.println("This is current thread running :"+Thread.currentThread());
			Thread.sleep(5000);
		}
		catch(Exception w)
		{
			System.out.println("Exception caught");
		}
	}

}
