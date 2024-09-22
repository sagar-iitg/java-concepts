package com.sagar.epam.internal.skill.review.example1;

//method hiding concept

class Vehicle{

    public static String getDetails(){
        return "vechile";
    }
}

class Car extends Vehicle{

    public static String getDetails(){
        return "car";
    }
}

public class Main {

    public static void main(String[] args) {

        Vehicle v=new Car();
        Vehicle v1=new Vehicle();

        Car c1=new Car();

        //compile time error
        //Car c2=new Vehicle();

        System.out.println(v.getDetails());  //vechile
        System.out.println(v1.getDetails()); //vechile
        System.out.println(c1.getDetails()); //car

    }
}


