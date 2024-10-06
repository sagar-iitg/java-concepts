package com.sagar.epam.gs;

public class MagicPotion1 {
    public static void main(String[] args) {


        if (minimalSteps("ABABCABABCE") == 6
                && minimalSteps("ABCDABCE") == 8
                && minimalSteps("ABCABCE") == 5
                && minimalSteps("AAA") == 3
                && minimalSteps("AAAA") == 3
                && minimalSteps("BBB") == 3
                && minimalSteps("AAAAAA") == 4 && minimalSteps("ABCABCE")==5) {
            System.out.println();
            System.out.println("Pass");
        } else {
            System.out.println();
            System.out.println("Fail");
        }
    }
    public static int solve(String s, int i) {
        if (i < 0) {
            return 0;  // Base case: no characters left, no steps needed
        }

        int ans = i+1;

        // Step 1: Check if the current substring can be compressed using '*'
        if ((i + 1) % 2 == 0) {
            String sub1 = s.substring(0, (i + 1) / 2);
            String sub2 = s.substring((i + 1) / 2, i + 1);

            // If both halves are equal, we can use '*' for compression
            if (sub1.equals(sub2)) {
                ans = 1 + solve(s, (i + 1) / 2 - 1);  // Compress and move to the first half
            }
        }

        // Step 2: Handle the case where the current character can't be compressed
        ans = Math.min(ans, 1 + solve(s, i - 1));  // Process one character at a time

        return ans;
    }

    public static int minimalSteps(String s) {
        return solve(s, s.length() - 1);  // Start solving from the full string
    }

}
