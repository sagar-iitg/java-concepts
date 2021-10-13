package com.sagar.interview2;

import java.util.HashMap;
import java.util.Objects;

public class Dept {

    private String name;
    private String location;
    private int headCount;

    public Dept(String name, String location, int headCount) {
        this.name = name;
        this.location = location;
        this.headCount = headCount;
    }

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dept dept = (Dept) o;
        return headCount == dept.headCount &&
                Objects.equals(name, dept.name) &&
                Objects.equals(location, dept.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, headCount);
    }

    @Override
    public String toString() {
        return "-" + name + "-" + location + " -" + headCount;
    }

    public static void main(String[] args) {
        Dept math = new Dept("math", "india", 10000);
        Dept eng = new Dept("english", "delhi", 1000);
        Dept phy = new Dept("physics", "banglore", 1999);

        HashMap<Dept, Integer> map = new HashMap<>();
        map.put(math, math.getHeadCount());
        map.put(eng, eng.getHeadCount());
        map.put(phy, phy.getHeadCount());

        System.out.println("Initial map: " + map);

        // Modify the key object
        math.setHeadCount(100);
        System.out.println("Modified map: " + map);

        // Attempt to retrieve the value using the modified key
        Integer headCount = map.get(math);
        System.out.println(map.get(math));
        System.out.println("Retrieved headCount: " + headCount); // This will likely be null
    }
}
