package com.sagar.epam.gs;

public class PalindromeIgnoreSpecialChars {

    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            // Move left pointer to the next alphanumeric character
            while (left < right && !isAlphanumeric(input.charAt(left))) {
                left++;
            }
            // Move right pointer to the previous alphanumeric character
            while (left < right && !isAlphanumeric(input.charAt(right))) {
                right--;
            }

            // Compare characters ignoring case
            if (toLowerCase(input.charAt(left)) != toLowerCase(input.charAt(right))) {
                return false; // Characters don't match, not a palindrome
            }

            left++;
            right--;
        }

        return true; // All characters matched
    }

    // Helper method to check if a character is alphanumeric
    private static boolean isAlphanumeric(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }

    // Helper method to convert a character to lowercase
    private static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char)(c + 32); // Convert uppercase to lowercase
        }
        return c;
    }

    public static void main(String[] args) {
        String testString = "abc12&*#21cb   a";
        System.out.println(isPalindrome(testString));  // Output: true
    }
}
