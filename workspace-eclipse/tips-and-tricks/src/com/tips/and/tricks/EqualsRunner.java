package com.tips.and.tricks;

class Client {

	private int id;

	public Client(int id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	// equals
	// hashcode

}

public class EqualsRunner {

	public static void main(String[] args) {

		Client c1 = new Client(1);
		Client c2 = new Client(1);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c1));
		System.out.println(c2.equals(c2));
	}

}
