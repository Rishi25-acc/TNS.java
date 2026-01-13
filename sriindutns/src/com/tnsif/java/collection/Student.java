package com.tnsif.java.collection;

public class Student implements Comparable<Student> {
	int sid;
	String sname;
	double marks;
	
	public Student(int sid, String sname, double marks) {
		super();
		this.sid=sid;
		this.sname = sname;
		this.marks=marks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", marks=" + marks + "]";
	}
	
	public int compareTo(Student s) {
		
		return this.sname.compareTo(s.sname);
	}
	
	
}




