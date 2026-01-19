package com.tnsif.java.collection2;

import java.util.ArrayList;
import java.util.Collections; 

public class list {
	public static void main(String[] args) {
       
        ArrayList<String> fruits = new ArrayList<>();

        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial List: " + fruits);

        
        fruits.add(1, "Blueberry"); 
        System.out.println("After adding Blueberry at index 1: " + fruits);

        
        String favorite = fruits.get(2);
        System.out.println("The item at index 2 is: " + favorite);

        
        fruits.set(0, "Apricot");
        System.out.println("After changing index 0 to Apricot: " + fruits);

       
        System.out.println("List size: " + fruits.size());
        System.out.println("Does it contain 'Banana'? " + fruits.contains("Banana"));

        
        fruits.remove("Banana"); // Remove by object
        fruits.remove(2);        // Remove by index
        System.out.println("After removals: " + fruits);

       
        Collections.sort(fruits);
        System.out.println("Sorted List: " + fruits);

        
        fruits.clear();
        System.out.println("List after clear(): " + fruits);
        System.out.println("Is the list empty? " + fruits.isEmpty());
    }
}


