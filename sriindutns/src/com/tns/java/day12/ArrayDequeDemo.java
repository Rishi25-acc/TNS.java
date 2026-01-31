package com.tns.java.day12;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
	 public static void main(String[] args) {

	      
	        Deque<Integer> deque = new ArrayDeque<>();

	        
	        deque.addFirst(15);        
	        deque.addFirst(10);    
	        deque.addLast(20);    

	        
	        System.out.println("ArrayDeque elements: " + deque);


	        System.out.println("Removed first: " + deque.removeFirst());
	        System.out.println("Removed last: " + deque.removeLast());


	        System.out.println("Peek first: " + deque.peekFirst());
	        System.out.println("Peek last: " + deque.peekLast());

	        
	        System.out.println("Size of deque: " + deque.size());
	    }
	

}
