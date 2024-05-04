package com.sagar.pkg1.interfac;


interface interface1{
    int  x=10;

}

interface interface2{


    int y=20;
}


interface  interface3 extends interface1, interface2{


    int x=30;

    public static void main(String[] args) {
        int a=interface1.x;
        int b=interface2.y;
        int c=interface3.x;
        System.out.println(a+" "+b+" "+c);

    }
}
public class Example {
}
