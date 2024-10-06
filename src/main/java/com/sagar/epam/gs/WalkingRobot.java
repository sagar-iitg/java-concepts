package com.sagar.epam.gs;

import java.util.Arrays;

public class WalkingRobot {

    public static Integer[] walk(String path) {
        // Initialize the starting position
        int x = 0;
        int y = 0;

        // Iterate through each character in the input string
        for (char move : path.toCharArray()) {
            switch (move) {
                case 'U': // Move up
                    y++;
                    break;
                case 'D': // Move down
                    y--;
                    break;
                case 'L': // Move left
                    x--;
                    break;
                case 'R': // Move right
                    x++;
                    break;
                // Any other character is ignored
            }
        }

        // Return the final coordinates as an Integer array
        return new Integer[] {x, y};
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(Arrays.toString(walk(""))); // Output: [0, 0]
        System.out.println(Arrays.toString(walk("L"))); // Output: [-1, 0]
        System.out.println(Arrays.toString(walk("UUU"))); // Output: [0, 3]
        System.out.println(Arrays.toString(walk("ULDR"))); // Output: [0, 0]
    }


}
