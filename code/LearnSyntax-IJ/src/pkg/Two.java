package pkg;

interface Two {
    default void method () {
        System.out.println("One");
    }
}