package com.tnsif.java.collection;

import java.util.HashSet;
import java.util.Arrays;

public class Set {
	public static void main(String[] args) {
      
        HashSet<String> colors = new HashSet<>();

        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        
        
        colors.add("Red"); 

       System.out.println("Set content (Note: order is random): " + colors);

        
        if (colors.contains("Blue")) {
            System.out.println("Blue is in the set.");
        }

        
        System.out.println("Set size: " + colors.size());

        
        colors.remove("Green");
        System.out.println("After removing Green: " + colors);

        
        HashSet<String> warmColors = new HashSet<>(Arrays.asList("Red", "Orange", "Yellow"));

        
        HashSet<String> allColors = new HashSet<>(colors);
        allColors.addAll(warmColors);
        System.out.println("Union (All unique colors): " + allColors);

        
        HashSet<String> intersection = new HashSet<>(colors);
        intersection.retainAll(warmColors);
        System.out.println("Intersection (Common colors): " + intersection);

       
        colors.clear();
        System.out.println("Is the set empty? " + colors.isEmpty());
    }

}
