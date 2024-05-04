package com.sagar.hashandequals;

public class Human {


    private int aadharNo;

    private String name;



    public Human(int aadharNo,String name)
    {
        this.aadharNo=aadharNo;
        this.name=name;


    }
    @Override
    public int hashCode()
    {
        return aadharNo;
    }

    @Override
    public boolean equals(Object obj) {


        Human obj1=(Human) obj;

        if(obj==this)
            return true;

        if(obj==null)
            return false;


        if(obj.getClass()!=this.getClass())
            return false;


        if(this.aadharNo!=obj1.aadharNo)
            return false;

        if(!this.name.equals(obj1))
        {
            return false;
        }

        return true;


    }
}
