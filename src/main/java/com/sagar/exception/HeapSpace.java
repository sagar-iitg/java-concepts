// Java Program to demonstrate memory leaks 
package com.sagar.exception;
import java.util.Vector; 
public class HeapSpace {
	public static void main(String[] args) 
	{ 
		Vector a = new Vector(21312312); 
		Vector b = new Vector(2147412344); 
		Vector c = new Vector(219944); 
		System.out.println("Memory Leak in Java"); 
	} 
}
