package com.tnsif.java.collection2;

import java.util.HashMap;


public class Map {
	public static void main(String[] args) {
       
        HashMap<String, Integer> studentScores = new HashMap<>();

        
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Charlie", 78);
        System.out.println("Initial Map: " + studentScores);

 
        int aliceScore = studentScores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);

        
        studentScores.put("Alice", 90); 
        System.out.println("Updated Alice's score: " + studentScores.get("Alice"));

 
        boolean hasBob = studentScores.containsKey("Bob");
        boolean hasScore100 = studentScores.containsValue(100);
        System.out.println("Is Bob in the map? " + hasBob);
        System.out.println("Is there a score of 100? " + hasScore100);

        
        System.out.println("Number of entries: " + studentScores.size());

        
        studentScores.remove("Charlie");
        System.out.println("After removing Charlie: " + studentScores);

        
        studentScores.putIfAbsent("Bob", 95); 
        studentScores.putIfAbsent("Diana", 88); 
        System.out.println("After putIfAbsent: " + studentScores);

        
        studentScores.clear();
        System.out.println("Is the map empty now? " + studentScores.isEmpty());
    }

}
