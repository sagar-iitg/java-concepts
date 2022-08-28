package com.sagar.pkg2;

import com.sagar.pkg1.Student;

public class Subclass extends Student {

	Subclass() {
		super("sdk", 333, 33);
	}

	public static void main(String[] args) {

		Subclass student = new Subclass();

		System.out.println(student.name);

		student.fun();
	}
}
