package com.sagar.interview3.sapient;

public class CreditCardMask {
    public static String maskCreditCard(String cardNumber) {
        // Check if the input is valid
        if (cardNumber == null || cardNumber.length() != 16) {
            throw new IllegalArgumentException("Credit card number must be 16 digits long");
        }

        // Create the masked version
        String masked = "xxxxxxxxxxxx" + cardNumber.substring(12);

        return masked;
    }

    public static void main(String[] args) {
        String creditCardNumber = "1234567812345678";
        String maskedNumber = maskCreditCard(creditCardNumber);
        System.out.println(maskedNumber); // Output: xxxxxxxx5678
    }
}
