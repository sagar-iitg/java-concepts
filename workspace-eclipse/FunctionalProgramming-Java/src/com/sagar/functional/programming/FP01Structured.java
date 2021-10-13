package com.sagar.functional.programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {

		fun(List.of(12, 9, 10, 5));
	}

	private static void fun(List<Integer> n) {

		// How to loop Numbers?
		for (int i : n) {
			System.out.println(i);
		}
		// functional Approach

	}

}
