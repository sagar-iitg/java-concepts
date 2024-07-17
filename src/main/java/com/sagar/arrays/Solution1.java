package com.sagar.arrays;

// Calculate the Supreme Square value of a given number (using Java8 concepts):
// 1. Square Each digit and sum them.
// 2. Keep adding all the digits of sum until you reach a single digit
// Ex1: 1234 -> [1 + 4 + 9 + 16] -> 30 -> [3 + 0] -> 3
// Ex2: 42683 -> [16 + 4 + 36 + 64 + 9]-> 129 -> [1 + 2 + 9] -> 12 -> [1 + 2] -> 3
class Solution1 {
   public static void main(String[] args) {
        String value = "8123889456778899880005";
    // int rpt=4;// This indicates how many times input is repeated ... any # between 1, 100000
        int ssv = CalcSupremeSquareVal(value);
        System.out.println(ssv);
    }
    // Complete the below method

    public static int CalcSupremeSquareVal(String number) {
        int sumOfSquares = sumOfSquaresOfDigits(number);
        return reduceToSingleDigit(sumOfSquares);
    }
    private static int sumOfSquaresOfDigits(String number) {
        int sum = 0;
        for (char c : number.toCharArray()) {
            int digit = Character.getNumericValue(c);
            sum += digit * digit;
        }
        return sum;
    }
    private static int reduceToSingleDigit(int number) {
        while (number > 9) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return number;
    }
}