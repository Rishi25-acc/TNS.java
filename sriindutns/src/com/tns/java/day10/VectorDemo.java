package com.tns.java.day10;

import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {

	       
        Vector<Integer> v = new Vector<>();

        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);


        System.out.println("Vector elements: " + v);

      
        System.out.println("Element at index 1: " + v.get(1));

      
        v.remove(2);

        System.out.println("Size of Vector: " + v.size());

  
        System.out.println("Using for-each loop:");
        for (int num : v) {
            System.out.println(num);
        }
    }
	

}
