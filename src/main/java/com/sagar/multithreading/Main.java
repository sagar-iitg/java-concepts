package com.sagar.multithreading;

class Printer {
    private boolean isEvenTurn = false;

    synchronized void printEven(int number) {
        while (!isEvenTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println( number);
        isEvenTurn = false;
        notify();
    }

    synchronized void printOdd(int number) {
        while (isEvenTurn) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(number);
        isEvenTurn = true;
        notify();
    }
}

class EvenNumbers implements Runnable {
    private final Printer printer;

    EvenNumbers(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 2; i <= 50; i += 2) {
            printer.printEven(i);
        }
    }
}

class OddNumbers implements Runnable {
    private final Printer printer;

    OddNumbers(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 49; i += 2) {
            printer.printOdd(i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread evenThread = new Thread(new EvenNumbers(printer));
        Thread oddThread = new Thread(new OddNumbers(printer));

        evenThread.start();
        oddThread.start();
    }
}
