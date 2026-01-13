package com.tnsif.java.collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {
		List<Person> ob = new ArrayList<Person>();
		Person p = new Person("Surya","Mumbai");
		ob.add(p);
		p = new Person("Yash","Karnataka");
		ob.add(p);
		p = new Person("Arjun","Hyderabad");
		ob.add(p);
		p = new Person("Bhajirao","Pune");
		ob.add(p);
		
		System.out.println(ob);
		System.out.println("Sorting of Names");
		Collections.sort(ob,new SortByName());
		System.out.println(ob);
		
		System.out.println("Sorting of City");
		Collections.sort(ob,new SortByCity());
		System.out.println(ob);
	}
}
