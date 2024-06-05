package com.sagar.enums.example1;

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        System.out.println("Today is " + today);
        System.out.println("It is a " + today.getTypeOfDay());
    }
}
