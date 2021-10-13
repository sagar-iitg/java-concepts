package com.sagar.collections.map;

import java.util.ArrayList;
import java.util.List;

public class CollectionArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4));

		System.out.println(arr);
		System.out.println(arr.get(0));
	}
}
