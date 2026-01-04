package com.tnsif.java.day6;

public class Shapedemo {
	public static void main(String[] args) {
		Rectangle r= new Rectangle();
		r.setl(4);
		r.setb(9);
		r.calarea();
		
		System.out.println("LENGTH:"+r.getb());
		System.out.println("BREADTH:"+r.getl());
		
		square s = new square();
		s.sets(7);
		s.calarea();
		
		System.out.println("SQUARE SIDES:"+s.gets());
	}
	

}
