package com.sagar.gfg.pkg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class FirstNegativeInWindow {

    /*
        input
        1 (no of test case)
        -2 0 -4 9 -66 8 9 -91 -8 -23 -9 95
        3
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());  // Number of test cases
        while (t-- > 0) {
            // Read the array
            String line = br.readLine();
            String[] tokens = line.split(" ");
            ArrayList<Integer> array = new ArrayList<>();
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            // Convert ArrayList to int[]
            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) {
                arr[idx] = i;
                idx++;
            }

            // Read the window size k
            int k = Integer.parseInt(br.readLine());

            // Call the function and store the result
            List<Integer> result = printFirstNegativeInteger(arr, k);

            // Print the result for the current test case
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static List<Integer> printFirstNegativeInteger(int arr[], int k) {
        List<Integer> ans = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        // Process the first window
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                deque.add(i);
            }
        }

        // Traverse the rest of the array
        for (int i = k; i < arr.length; i++) {
            // Add the first negative number from the deque, or 0 if none
            if (!deque.isEmpty()) {
                ans.add(arr[deque.peek()]);
            } else {
                ans.add(0);
            }

            // Remove elements that are out of this window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Add current element if it is negative
            if (arr[i] < 0) {
                deque.add(i);
            }
        }

        // For the last window
        if (!deque.isEmpty()) {
            ans.add(arr[deque.peek()]);
        } else {
            ans.add(0);
        }

        return ans;
    }
}
