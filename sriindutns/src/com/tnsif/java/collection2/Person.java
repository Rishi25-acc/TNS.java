package com.tnsif.java.collection2;

import java.util.Comparator;

public class Person implements Comparator<Person> {
	String name;
	String city;
	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
class SortByName implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		
		return p1.getName().compareTo(p2.getName());
	}
		
}
class SortByCity implements Comparator<Person>{
	
	public int compare(Person p1, Person p2) {
		return p1.getCity().compareTo(p2.getCity());
	}
}