package com.sagar.pkg1;

public class Student {

	protected String name;
	protected int roll_no;
	protected double marks;

	public Student() {
		System.out.println("Constructor class Student");
	}

	public Student(String name, int roll_no, double marks) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.marks = marks;
	}

	protected void fun() {
		System.out.println("protected fun function in Student class");
	}

}
