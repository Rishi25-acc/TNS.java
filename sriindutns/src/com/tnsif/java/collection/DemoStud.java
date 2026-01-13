package com.tnsif.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class DemoStud {

	public static void main(String[] args) {
		ArrayList<Student>ob = new ArrayList<Student>();
		
		Student s = new Student(101,"Rishi",92.2);
		ob.add(s);
		s = new Student(102,"Pooja",89.2);
		ob.add(s);
		s = new Student(102,"Deeks",98.2);
		ob.add(s);
		s = new Student(102,"Jash",85.2);
		ob.add(s);
		s = new Student(102,"Bunny",90.2);
		ob.add(s);
		System.out.println("Before sorting....");
		System.out.println(ob);
		System.out.println("After sorting.....");
		Collections.sort(ob);
		System.out.println(ob);
		
	}

}
