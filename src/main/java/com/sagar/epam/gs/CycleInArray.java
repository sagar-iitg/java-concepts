package com.sagar.epam.gs;

public class CycleInArray{
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
        int[] arr10={2,1};

        // Testing with all test cases
        System.out.println(isCycle(arr1, 0)); // true
        System.out.println(isCycle(arr2, 0)); // true
        System.out.println(isCycle(arr3, 0)); // true
        System.out.println(isCycle(arr4, 0)); // true
        System.out.println(isCycle(arr5, 0)); // false
        System.out.println(isCycle(arr6, 0)); // false
        System.out.println(isCycle(arr7, 0)); // true
        System.out.println(isCycle(arr8, 0)); // false
        System.out.println(isCycle(arr9, 0)); // false
        System.out.println(isCycle(arr10, 0)); // false

    }
    private static boolean isCycle(int[] arr,int startIndex){

        if (arr.length <= 1) {
            return false; // No cycle is possible in arrays of size 1
        }

        int slow = startIndex;
        int fast = startIndex;

        while(true){

            slow = arr[slow];
            if (slow >= arr.length || slow < 0) {
                return false; // no cycle if slow goes out of bounds
            }

            // Move fast two steps
            fast = arr[fast];
            if (fast >= arr.length || fast < 0) {
                return false; // no cycle if fast goes out of bounds
            }
            fast = arr[fast];
            if (fast >= arr.length || fast < 0) {
                return false; // no cycle if fast goes out of bounds
            }

            // Check if slow equals fast (cycle detected)
            if (slow == fast) {
                return true; // cycle detected
            }






        }


    }
}
