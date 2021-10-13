package com.sagar.thread;

public class Example1 extends  Thread{

    public static void main(String[] args) {

        System.out.println("Hello WWorld");
        Example1 e=new Example1();
        e.start();

    }
    @Override
    public void run()
    {
        System.out.print("Welcome to GeeksforGeeks.");
    }
}
