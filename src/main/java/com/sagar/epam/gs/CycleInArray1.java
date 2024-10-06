package com.sagar.epam.gs;

public class CycleInArray1 {
    public static void main(String[] args) {


        int[] arr1 = {1, 0};         // true (cycle: 0->1->0)
        int[] arr2 = {1, 2, 0};      // true (cycle: 0->1->2->0)
        int[] arr3 = {1, 2, 0, 4, 5}; // true (cycle: 0->1->2->0)
        int[] arr4 = {1, 2, 3, 1};   // true (cycle: 1->2->3->1)
        int[] arr5 = {1, 2, 3, 4, 5}; // false (no cycle)
        int[] arr6 = {1};            // false (single element, no cycle)
        int[] arr7 = {1, 1};         // true (self-loop: 1->1)
        int[] arr8 = {2, -1, 1};     // false (no cycle)
        int[] arr9 = {2, 5, 1};      // false (out of bounds)
        int[] arr10 = {2, 1};
              // true (cycle: 0->1->0)
        System.out.println(findLoopLength(arr3, 0)); // Expected: -1
    }


    public static int findLoopLength(int[] arr, int startIndex) {
        if (arr == null || startIndex < 0 || startIndex >= arr.length) {
            return -1; // Invalid input
        }

        int slow = startIndex;
        int fast = startIndex;

        // Finding the intersection point in the loop
        while (true) {
            // Move slow pointer
            if (arr[slow] < 0 || arr[slow] >= arr.length) {
                return -1; // Invalid index or no loop
            }
            slow = arr[slow]; // Move slow by 1 step

            // Move fast pointer
            if (arr[fast] < 0 || arr[fast] >= arr.length) {
                return -1; // Invalid index or no loop
            }
            fast = arr[arr[fast]]; // Move fast by 2 steps

            // Check if fast moved out of bounds
            if (fast >= arr.length) {
                return -1; // No loop
            }

            if (slow == fast) {
                break; // Loop detected
            }
        }

        // Now let's find the loop length
        int loopLength = 0;
        do {
            slow = arr[slow];
            loopLength++;
        } while (slow != fast);

        return loopLength;
    }


}






