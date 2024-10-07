package com.sagar.epam.gs;

public class PalindromeIgnoreSpecialChars1 {

    public static boolean isPalindrome(String input) {
        // Use StringBuilder to construct a clean string (only alphanumeric characters)
        StringBuilder cleanedString = new StringBuilder();

        // Traverse the string, ignoring non-alphanumeric characters
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanedString.append(Character.toLowerCase(c)); // Convert to lowercase for case insensitivity
            }
        }

        // Now compare the cleaned string with its reverse
        String forward = cleanedString.toString();
        String reverse = cleanedString.reverse().toString(); // Reverse the cleaned string

        return forward.equals(reverse);
    }

    public static void main(String[] args) {
        String testString = "abc12&*#21cb   a";
        System.out.println(isPalindrome(testString));  // Output: true
    }
}
