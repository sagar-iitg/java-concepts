package com.sagar.hashandequals;

public class MainStudent {


    public static void main(String[] args) {

        Student s=new Student(1,"sk");
        Student h=new Student(1,"sk");

        System.out.println(s.equals(h));
        System.out.println(s.hashCode());
        System.out.println(h.hashCode());
    }
}
