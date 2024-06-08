package com.sagar.collections.map;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		// System.out.println(q.isEmpty());
		q.add(1);
		q.add(2);
		q.add(7 / 2);
		System.out.println(q);
		System.out.println(q.element());
		// System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.isEmpty());
	}
}
