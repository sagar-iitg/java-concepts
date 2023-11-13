package com.udemy.api;

public class RecordsRunner {

	record Person(String name, String email, String phNo) {
	}

	public static void main(String[] args) {
		Person p = new Person("Sagar", "sk@gmail.com", "70266");
		Person p1 = new Person("Sagarkdkdkd", "skfkfkk@gmail.com", "70dkmdmm266");
		System.out.println(p1);
		System.out.println(p);

	}

}
