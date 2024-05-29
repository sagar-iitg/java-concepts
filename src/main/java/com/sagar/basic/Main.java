package com.sagar.basic;

public class Main implements A{

    @Override
    public void method() {

        System.out.println("hello method");
    }

    public static void main(String[] args) {
        System.out.println("hello"+2*30);
        System.out.println(2*30+"hello");
        Main obj=new Main();
        obj.method();
    }
}
