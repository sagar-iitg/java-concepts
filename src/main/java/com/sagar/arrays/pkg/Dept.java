package com.sagar.arrays.pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Dept {

    private String name;
    private String location;
    private int headCount;
    public Dept(String name,String location,int headCount){
        this.name=name;
        this.location=location;
        this.headCount=headCount;
    }
    //key
    // math-100
    // eng-100


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHeadCount() {
        return headCount;
    }

    public void setHeadCount(int headCount) {
        this.headCount = headCount;
    }

    @Override
    public String toString() {
        return "-"+name+"-"+location+" -"+headCount;
    }

    public static void main(String[] args) {
        Dept math=new Dept("math","india",10000);
        Dept eng=new Dept("english","delhi",1000);
        Dept phy=new Dept("physics","banglore",1999);
       // HashMap<Dept,String>

//        List<Dept> list=new ArrayList<>();
//        list.add(math);
//        list.add(eng);
//        list.add(phy);
        HashMap<Dept,Integer> map=new HashMap<>();
        System.out.println(map);
        map.put(math,math.getHeadCount());
        System.out.println("---"+map);
        math.setHeadCount(100);
        System.out.println(map);



        //list.stream().filter(i->i.headCount>1000).forEach(System.out::println);
    }
}
