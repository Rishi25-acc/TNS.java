package com.tnsif.java.collection2;

import java.util.LinkedList;

public class Queue {
	public static void main(String[] args) {
       
        LinkedList<String> line = new LinkedList<>();

        
        line.add("Customer 1");
        line.offer("Customer 2");
        line.offer("Customer 3");
        System.out.println("Current Queue: " + line);

        
        String frontPerson = line.peek();
        System.out.println("Person at the front: " + frontPerson);

        
        String removedPerson = line.poll();
        System.out.println("Served: " + removedPerson);
        System.out.println("Queue after serving: " + line);

       
        System.out.println("Is the queue empty? " + line.isEmpty());
        System.out.println("Number of people in line: " + line.size());

        
        boolean isPresent = line.contains("Customer 2");
        System.out.println("Is Customer 2 still here? " + isPresent);

        
        line.clear();
        System.out.println("Queue after clear(): " + line);
    }

}
