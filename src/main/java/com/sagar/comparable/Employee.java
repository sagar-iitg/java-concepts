package com.sagar.comparable;

public class Employee implements Comparable<Employee>{
	
	
	int id;
	String name;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString()
	{
		return "["+ this.id + " "+this.name + "]";
		
		
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}





	
	
	
	

}
