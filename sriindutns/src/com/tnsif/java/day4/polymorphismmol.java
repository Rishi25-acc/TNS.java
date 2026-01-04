package com.tnsif.java.day4;

public class polymorphismmol {
	int pid = 22;
	String pname="NANI";
	String pmail="pn@gmail.com";
	public void show() {
		System.out.println("A:"+pid);
	}
    public void show(int a) {
    	System.out.println("B:"+pid);
    }
    public void show(String a,double b) {
    	System.out.println("C:"+pmail);
    }

}
