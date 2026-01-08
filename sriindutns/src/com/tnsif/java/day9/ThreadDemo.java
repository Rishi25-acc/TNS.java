package com.tnsif.java.day9;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException{
		for(int i=0;i<5;i++)
		{
			multiThreads mt = new multiThreads();
			mt.start();
			Thread.sleep(5000);
		}
	}

}
