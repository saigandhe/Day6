package com.capgemini.collection;

public class Student1 implements Comparable<Student1>{

	private String name;
	private String branch;
	private int rollno;
	public Student1() {
		super();
		
	}
	public Student1(String name, String branch, int rollno) {
		super();
		this.name = name;
		this.branch = branch;
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public int compareTo(Student1 o) {
		
		return Integer.compare(this.rollno, o.rollno);
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", branch=" + branch + ", rollno=" + rollno + "]";
	}	
	
}
