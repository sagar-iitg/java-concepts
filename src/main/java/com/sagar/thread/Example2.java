package com.sagar.thread;

public class Example2 implements Runnable{


    public static void main(String[] args) {

        Example2 example2=new Example2();
        Thread th=new Thread(example2,"threadname");
        th.start();
        System.out.println(th.getName());
    }
    @Override
    public void run() {
        System.out.println("Inside run method");
    }
}
