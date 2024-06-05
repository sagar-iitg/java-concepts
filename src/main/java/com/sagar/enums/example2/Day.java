package com.sagar.enums.example2;

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

class EnumPropertiesExample {
    public static void main(String[] args) {
        // Using name() and ordinal()
        Day today = Day.WEDNESDAY;
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
    }
}
