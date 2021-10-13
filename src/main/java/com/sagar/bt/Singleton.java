package com.sagar.bt;

public class Singleton {


    private static  Singleton instance=null;
    private Singleton(){

    }

    public static Singleton createSingletonObject(){
        if(instance==null) return new Singleton();
        else return  instance;
    }


}
