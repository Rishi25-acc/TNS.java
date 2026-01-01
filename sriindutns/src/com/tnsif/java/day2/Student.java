package com.tnsif.java.day2;

public class Student {
	
	
	private int Sid;
	private String Sname;
	private int Smarks;
	
	
	public void setSid(int Sid) {
		this.Sid = Sid;
	}
	
	
	public int getSid() {
		return Sid;
	}
	
	
	public void setSname(String Sname) {
		this.Sname = Sname;
	}

	
	public String getSname() {
		return Sname;
	}
	
	
	public void setSmarks(int Smarks) {
		this.Smarks = Smarks;
	}

	
	public int getSmarks() {
		return Smarks;
	}
	
	
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setSid(1237);
		s.setSname("RISHI");
		s.setSmarks(98);
		
		System.out.println("Student ID:"+s.getSid());
		System.out.println("Student Name :"+s.getSname());
		System.out.println("Student Marks:"+s.getSmarks());
	}
}