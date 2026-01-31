package com.tns.java.day11;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
public static void main(String[] args) {

        
        HashMap<Integer, String> map = new HashMap<>();

       
        map.put(1, "Python");
        map.put(2, "Java");
        map.put(3, "HTML");

       
        System.out.println("HashMap elements: " + map);

       
        System.out.println("Value for key 2: " + map.get(2));

      
        map.remove(3);

       
        System.out.println("Contains key 1? " + map.containsKey(1));

     
        System.out.println("Using entrySet:");
        for (Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
	

}
