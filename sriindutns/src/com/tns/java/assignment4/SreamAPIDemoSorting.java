package com.tns.java.assignment4;

import java.util.Arrays;
import java.util.List;

public class SreamAPIDemoSorting {
	
public static void main(String [] args) {
		
		
		//Stream API using Sorting Collection
		//Examples :- (10,2,4,6,8)
		List<Integer>list=Arrays.asList(10,2,4,6,8);	
		list.stream()
		.sorted()
		.forEach(System.out::println);
	}

}
