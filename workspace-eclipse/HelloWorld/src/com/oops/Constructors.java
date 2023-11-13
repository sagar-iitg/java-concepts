package com.oops;




class MyMainEmployee{
	
	
	private int id;
	private String name;
	
	public MyMainEmployee() {
		id=45;
		name="Your Name";
		
	}
	public MyMainEmployee(int myId,String myname) {
		id=myId;
		name=myname;
		
	}
	
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
		this.id=i;
	}
	
	
}
public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyMainEmployee sag=new MyMainEmployee();
//		sag.setName("Sagar Kumar");
//		sag.setId(0);
		System.out.println(sag.getName());
		System.out.println(sag.getID());
		MyMainEmployee s=new MyMainEmployee(12,"SK");
		System.out.println(s.getName());
		System.out.println(s.getID());
		System.out.println(5*2);
		
				
				

	}

}
