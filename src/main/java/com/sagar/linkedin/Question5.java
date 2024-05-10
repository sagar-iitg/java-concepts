package com.sagar.linkedin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Question5 {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
		arr.add("sagar");
		arr.add("mohit");
		arr.add("ankit");
		System.out.println(arr);
		arr.sort(Comparator.comparing(String::toString));
		System.out.println(arr);
		arr.add("aaa");
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
	}
}
