package com.sagar.java8;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		Patient p1=new Patient("p1",20,"Corona",18000);
		Patient p2=new Patient("p2",26,"Fever",6000);
		Patient p3=new Patient("p3",29,"corona",8000);
		Patient p4=new Patient("p4",23,"Corona",12000);
		
		List<Patient> list=List.of(p1,p2,p3,p4);
		//System.out.println(list);
		
		//list.stream().filter(x->x.getDisease().equalsIgnoreCase("Corona")).forEach(System.out::println);
		//list.stream().filter(x->x.getDisease().equalsIgnoreCase("Corona") && x.getAge() >=25).forEach(System.out::println);
	Double avgBill=list.stream().filter(x->x.getDisease().
			equalsIgnoreCase("Corona")).
			collect(Collectors.averagingDouble(Patient::getAmount));
	
	
	System.out.println(avgBill);
	
		
	}

}
