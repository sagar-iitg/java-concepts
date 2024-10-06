package com.sagar.epam.gs;

public class MagicPotion {

    public static void main(String[] args) {

        String  s="ABCABCE";
        int ans=minimalSteps(s);
        System.out.println(ans);
        if (minimalSteps("ABABCABABCE") == 6
                && minimalSteps("ABCDABCE") == 8
                && minimalSteps("ABCABCE") == 5
                && minimalSteps("AAA") == 3
                && minimalSteps("AAAA") == 3
                && minimalSteps("BBB") == 3
                && minimalSteps("AAAAAA") == 4   && minimalSteps("ABCABCABC") == 7 )
               {
            System.out.println();
            System.out.println("Pass");
        } else {
            System.out.println();
            System.out.println("Fail");
        }
    }

    private static int minimalSteps(String ingredients) {
        // Base case: if the string is empty, no encoding needed
        if (ingredients.isEmpty()) {
            return 0;
        }

        // Base case: if there's only one character, it takes one step to encode
        if (ingredients.length() == 1) {
            return 1;
        }

        int n = ingredients.length();
        int minLength = n;  // Maximum length without optimization is the full string

        // Try to encode the string in every possible way
        for (int i = 1; i <= n; i++) {
            // Calculate the minimum encoding by splitting at position i
            minLength = Math.min(minLength, i + minimalSteps(ingredients.substring(i)));

            // Check for repeated prefixes
            for (int len = 1; len <= i / 2; len++) {
                if (repeatString(ingredients, 0, len - 1, len, i - 1)) {

                    minLength = Math.min(minLength, minimalSteps(ingredients.substring(0, len)) + 1 + minimalSteps(ingredients.substring(i)));
                }
            }
        }

        return minLength;
    }

    /**
     * Checks if the two substrings s[i..j] and s[k..l] are equal.
     */
    private static boolean repeatString(String s, int i, int j, int k, int l) {
        return s.substring(i, j + 1).equals(s.substring(k, l + 1));
    }



}
