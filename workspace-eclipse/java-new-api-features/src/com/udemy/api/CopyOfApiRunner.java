package com.udemy.api;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

	private static void doNotChange(List<String> names) {
		// TODO Auto-generated method stub
		names.add("ShouldNotBeallowed");

	}

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("ranga");
		names.add("ankit");
		names.add("ravi");
		List<String> copyOfNames = List.copyOf(names);

		doNotChange(copyOfNames);
		System.out.println(copyOfNames);

	}

}
