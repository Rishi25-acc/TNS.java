package com.tns.java.practice;

public class Practice {
	private int pid;
	public void  setpid(int pid)
	{
		this.pid=pid;
    }
	public int getpid()
	{
		return pid;
	}
	public static void main(String [] args)
	{
	Practice p =new Practice();
	
	p.setpid(34);
	System.out.println("PRACTICE ID:"+p.getpid());
	}
}
