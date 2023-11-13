package com.sagar.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main{
	
	
	
	public static void main(String[] args) {
		
		
		ArrayList<Student> list=new ArrayList<>();
		Student s1=new Student(1452008,"sagar",25);
		Student s2=new Student(1452031,"mohit",24);
		Student s3=new Student(1452006,"mrinmoy",26);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		//System.out.println(list);
		Collections.sort(list,new IdName());
		System.out.println(list);
		
		
		
		
		
	}

}
