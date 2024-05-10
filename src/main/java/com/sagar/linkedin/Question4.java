package com.sagar.linkedin;

class Main {

	Object message() {
		// TODO Auto-generated method stub
		return "hello";
	}

}

class Main2 extends Main {

	@Override
	String message() {
		return "World!";
	}
}

public class Question4 {

	public static void main(String[] args) {
		System.out.println(new Main().message());
		System.out.println(new Main2().message());
	}
}
