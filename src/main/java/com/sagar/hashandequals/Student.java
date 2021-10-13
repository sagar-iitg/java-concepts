package com.sagar.hashandequals;

import java.util.Objects;

public class Student {


    private int rollNo;
    private String name;

    public Student(int rollNo,String name)
    {

        this.rollNo=rollNo;
        this.name=name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return this.rollNo == student.rollNo && Objects.equals(this.name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name);
    }
}
