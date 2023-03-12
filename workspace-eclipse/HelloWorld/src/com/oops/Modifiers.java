package com.oops;



class MyEmployee{
	
	
	private int id;
	private String name;
	
	//getters
	public String getName() {
		return name;
	}
	//setters
	public void setName(String n) {
		this.name=n;
	}
	//getters
	public int getID() {
		return id;
	}
//	setters
	
	public void setId(int i) {
		id=i;
	}
	
	
}
public class Modifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyEmployee sag=new MyEmployee();
//		sag.id=4;
//		sag.id="sagar kumar";
		
//		Data Hiding (Access through methods)
		
		sag.setName("sagar Kumar");
		System.out.println(sag.getName());
		
		
		
		
		
		

	}

}
