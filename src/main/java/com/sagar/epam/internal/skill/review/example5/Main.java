package com.sagar.epam.internal.skill.review.example5;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread(); // Create a new thread object
        thread.run();                   // Start the thread
    }
}
