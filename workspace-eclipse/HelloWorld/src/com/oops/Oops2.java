package com.oops;



class Cellphone{
	
	
	public void ring() {
		System.out.println("Ringing ...");
	}
	
	public void vibrate() {
		System.out.println("Vibrating .....");
	}
	
	
	
}


class Employee1{
	
	
	//Attributes
	
	int salary;
	String name;
	
	//Method (class Method)
	
	public int getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name=n;
	}
	
	
}



public class Oops2 {
	
	public static void main(String[] args) {
		
		Employee1 sagar=new Employee1();
		sagar.setName("Sagar Kumar");
		sagar.salary=82;
		System.out.println(sagar.getName());
		System.out.println(	sagar.getSalary());
		Cellphone vivo=new Cellphone();
		vivo.ring();
		vivo.vibrate();
		
		
	
		
		
		
	}

}


