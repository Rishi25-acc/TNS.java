package com.tns.java.day14;

import java.util.HashMap;

public class LambdaWithMap {
	
	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("RISHI", 59);
		hm.put("DEEKS", 4);
		hm.put("JASH", 11);
		
		hm.forEach((key,value)->System.out.println("NAME:"+ key + "ROLL.NO:"+value));

	}

	
	

}
