package com.sagar.arrays;

class EvenNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(100); // Sleep to simulate time taken to perform operations
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(100); // Sleep to simulate time taken to perform operations
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenNumbers());
        Thread oddThread = new Thread(new OddNumbers());

        evenThread.start();
        oddThread.start();
    }
}
