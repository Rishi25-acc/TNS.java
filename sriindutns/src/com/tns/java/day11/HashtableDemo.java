package com.tns.java.day11;

import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
	public static void main(String[] args) {

	    
        Hashtable<Integer, String> table = new Hashtable<>();

        // Add elements
        table.put(1, "Python");
        table.put(2, "Java");
        table.put(3, "HTML");

        
        System.out.println("Hashtable elements: " + table);

        
        System.out.println("Value for key 2: " + table.get(2));

        
        table.remove(3);

        
        System.out.println("Contains key 1? " + table.containsKey(1));

        
        System.out.println("Using entrySet:");
        for (Map.Entry<Integer, String> entry : table.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }


}
