package com.sagar.enums.example3;

enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY


}

class EnumPropertiesExample {
    public static void main(String[] args) {
        // Using name() and ordinal()
        Day today = Day.MONDAY;
        System.out.println("Enum name: " + today.name());
        System.out.println("Enum ordinal: " + today.ordinal());

        // Using values()
        Day[] days = Day.values();
        System.out.println("Days of the week:");
        for (Day day : days) {
            System.out.println(day);
        }

        // Using valueOf()
        Day anotherDay = Day.valueOf("FRIDAY");
        System.out.println("Another day: " + anotherDay);

        System.out.println(today.toString());
    }
}
