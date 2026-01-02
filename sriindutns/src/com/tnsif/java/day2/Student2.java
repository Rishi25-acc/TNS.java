package com.tnsif.java.day2;

public class Student2 {
	public String Sname;
	public int Sid;
	public String Smail;
	public long Sno;
	
	public void setSname(String Sname)
	{
		this.Sname=Sname;
	}
	public String getSname()
	{
		return Sname;
	}
	public void setSid(int Sid)
	{
		this.Sid=Sid;
	}
	public int getSid()
	{
		return Sid;
	}
	public void setSmail(String Small)
	{
		this.Smail=Smail;
	}
	public String getSmail()
	{
		return Smail;
	}
	public void setSno(long Sno)
	{
		this.Sno=Sno;
	}
	public long getSno()
	{
		return Sno;
	}
	public static void main(String[] args)
	{
		Student2 s = new Student2();
		s.setSname("RISHI");
		s.setSid(1237);
		s.setSmail("Rishikoltur");
		s.setSno(8985420276L);
		
		System.out.println("Student Name:"+s.getSname());
		System.out.println("Student Id:"+s.getSid());
		System.out.println("Student Name:"+s.getSmail());
		System.out.println("Student Name:"+s.getSno());
	}
}