package com.sagar.collections.map;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap {

	public static void main(String[] args) {

		int[] arr = { 2, 7, 11, 15 };
		int target = 9;
		int[] res = new int[2];
		res = twoSum(arr, target);
		System.out.println(res[0] + " " + res[1]);
	}

	private static int[] twoSum(int[] arr, int target) {

		int[] ans = new int[2];
		int n = arr.length;
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {

			System.out.println(map.containsKey(arr[i]));

			if (map.containsKey(target - arr[i])) {

				ans[1] = i;
				ans[0] = map.get(target - arr[i]);
				break;
			}
			map.put(arr[i], i);
		}

		System.out.println(map);
		return ans;
	}
}
