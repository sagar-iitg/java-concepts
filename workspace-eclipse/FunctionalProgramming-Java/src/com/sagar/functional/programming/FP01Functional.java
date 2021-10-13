package com.sagar.functional.programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {

		fun(List.of(12, 9, 10, 5));
	}

	private static void fun(List<Integer> numbers) {

		// functional Approach
		numbers.stream().forEach(System.out::println);

	}

}
