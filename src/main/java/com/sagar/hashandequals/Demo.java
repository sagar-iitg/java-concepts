package com.sagar.hashandequals;


class Employee{

    int id;

    public Employee(int id){
            this.id=id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
}
public class Demo {

    public static void main(String[] args) {

        Employee e1=new Employee(1);
        Employee e2=new Employee(1);
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e1==e2);
    }



}
