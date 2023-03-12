package com.udemy.api;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {

		List<Integer> numbers = List.of(3, 4, 5, 6, 7, 8990, 1);
		Predicate<Integer> evenNumberPredicate = number -> number % 2 == 0;
		System.out.println("\nEven number\n");
		numbers.stream().filter(evenNumberPredicate).forEach(System.out::println);
		System.out.println("\nodd Number\n");
		numbers.stream().filter(evenNumberPredicate.negate()).forEach(System.out::println);
		System.out.println("Using function even no");
		numbers.stream().filter(PredicateNotRunner::isEven).forEach(System.out::println);
		System.out.println("Using function odd no");
		numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);

	}

}
