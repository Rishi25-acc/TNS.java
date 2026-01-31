package com.tns.java.day12;


import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	
public static void main(String[] args) {

        
        Queue<Integer> pq = new PriorityQueue<>();

       
        pq.add(30);
        pq.add(20);
        pq.add(40);
        pq.add(50);
        pq.add(60);

        System.out.println("PriorityQueue elements: " + pq);

        
        System.out.println("Peek element: " + pq.peek());


        System.out.println("Poll element: " + pq.poll());
        System.out.println("After poll: " + pq);

        
        System.out.println("Size: " + pq.size());
    }

}
