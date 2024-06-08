package com.sagar.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		
		Employee emp1=new Employee(10,"sk");
		Employee emp2=new Employee(1,"app");
		Employee emp3=new Employee(2,"nitin");
		Employee emp4=new Employee(2,"xyz");
		
		
		
		ArrayList<Employee> list=new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);

		System.out.println(list);
		Collections.sort(list);

		System.out.println(list);
	}

}
