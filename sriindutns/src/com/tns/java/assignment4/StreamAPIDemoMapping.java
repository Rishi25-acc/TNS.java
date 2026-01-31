package com.tns.java.assignment4;


import java.util.Arrays;
import java.util.List;

public class StreamAPIDemoMapping {
	
public static void main(String[] args) {
		
		//Stream API using Mapping
		//Examples :- ("RISHI","DEEKS","JASH")
				List<String>names=Arrays.asList("Rishi","Deeks","Jash");
				names.stream()
				.map(name->name.toUpperCase())
				.forEach(System.out::println);
	

	}

}
