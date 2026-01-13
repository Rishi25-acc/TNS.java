package com.tnsif.java.collection;


import java.util.ArrayList;
import java.util.LinkedList;

public class Democoll {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(101);
		al.add("Hello");
		al.add(23.4f);
		al.add('c');
		al.add(101);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		
		LinkedList li = new LinkedList();
		li.addFirst(101);
		li.addFirst("TNS");
		li.addFirst(10.23);
		li.addLast('H');
		li.addLast(129);
		System.out.println(li);
		li.removeFirst();
		System.out.println(li);
		
	}
	

}
