package com.oops;




class Employee{
	
	int id;
	String name;
	public void printDetails()
	{
		System.out.println("My id is "+id);
		System.out.println("and my name is "+name);
	}
}

public class Oops1 {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Custom Class");
		System.out.println("---------------");
		Employee sagar=new Employee();
		Employee sk=new Employee();
		sagar.id=194161013;
		sagar.name="Sagar Kumar";
		sk.id=19413;
		sk.name="Na";
		
		//Printing Attributes
		
//		System.out.println(sagar.id);
//		System.out.println(sagar.name);
		sagar.printDetails();
		sk.printDetails();
		
		
		
		

	}

}
