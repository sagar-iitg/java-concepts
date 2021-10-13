package com.sagar.arrays.pkg;// Java Program to Illustrate Autoboxing

// Importing required classes
import java.io.*;
import java.util.*;

// Main class
class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating an empty ArrayList of integer type
		List<Integer> list = new ArrayList<Integer>();

		// Adding the int primitives type values by
		// converting them into Integer wrapper object

		System.out.println(list.add(new Integer(200)));
		System.out.println(list);
//		for (int i = 0; i < 10; i++)
//
//
//			System.out.println(Integer.valueOf(i));
//			//System.out.println(
//				//list.add(Integer.valueOf(i)));
}
}
