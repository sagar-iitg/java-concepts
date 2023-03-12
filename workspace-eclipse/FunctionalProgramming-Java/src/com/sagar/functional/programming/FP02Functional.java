package com.sagar.functional.programming;

import java.util.List;

public class FP02Functional {

	public static void main(String[] args) {

		fun(List.of(12, 9, 10, 5, 10, 23, 34, 56, 78, 0, 2, 34, 33));
	}

	private static void fun(List<Integer> numbers) {

		// functional Approach
		// numbers.stream().forEach(System.out::println);
		// Only Even number
		numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	}

}
