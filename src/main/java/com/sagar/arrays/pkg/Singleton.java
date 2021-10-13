package com.sagar.arrays.pkg;

public class Singleton {


    private static Singleton instance=null;

    //
    private Singleton(){

    }

    public synchronized  static Singleton createObject(){
        if(instance==null)
            instance=new Singleton();
        return instance;
    }

    public static void main(String[] args) {
        Singleton obj=Singleton.createObject();
        Singleton obj1=Singleton.createObject();
        System.out.println(obj.hashCode() );
        System.out.println(obj1.hashCode());

    }


}
