package com.sagar.bt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
   private String id;
    private String name;
   private String salary;

    public Employee(String id, String name, String salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.id+" "+this.name+"  "+this.salary;
    }

    public static void main(String[] args) {

        Employee e1=new Employee("1","sagar","1000");
        Employee e2=new Employee("2","rohit","1000000");
        Employee e3=new Employee("3","nitish","1000000");
        Employee e4=new Employee("4","mohit","100000");
        Employee e5=new Employee("5","mohit","10000");

        List<Employee> list=new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        System.out.println(list);

        //Collections.sort(list, Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
        Collections.sort(list, Comparator.comparing(Employee::getName).reversed().thenComparing(Employee::getSalary));
        System.out.println(list);


    }

}
