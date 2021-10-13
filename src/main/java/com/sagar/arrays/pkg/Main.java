package arrays.pkg;

import java.util.ArrayList;
import java.util.Arrays;

class Employee{

    private int salary;


    Employee(){
        this.salary=salary;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
public class Main {

    public static void main(String[] args) {

       // Employee[] e=new Employee[];

        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        Employee e4=new Employee();
        Employee e5=new Employee();
        e1.setSalary(10000);
        e2.setSalary(20000);
        e3.setSalary(30000);
        e4.setSalary(40000);
        e5.setSalary(50000);

        ArrayList<Employee> arr=new ArrayList<>();
        arr.add(e1);
        arr.add(e2);
        arr.add(e3);
        arr.add(e4);
        arr.add(e5);


        System.out.println("Before Hike");
        System.out.println();
        for(Employee i:arr){

            if(i.getSalary()>=30000)
            {

                int salaryIncrease=i.getSalary();
                i.setSalary( (int)((int)salaryIncrease*1.1));
            }



            else
            {
                int salaryIncreased2=i.getSalary();
                i.setSalary((int) ((int)salaryIncreased2*1.2) );

            }


        }


        for (Employee i:arr) {
            System.out.println(i.getSalary());

        }


    }


}
