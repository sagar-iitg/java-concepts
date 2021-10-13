package com.company;

import java.util.Scanner;

public class Else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		System.out.println("Enter your age");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt(); //Input 
		if(age>56) {
			System.out.println("You r Experienced");
		}
		else if (age>46) {
			System.out.println("You r semi-experienced");
		}
		else if (age>36) {
			System.out.println("You r semi-semi experienced");
			
		}
		else {
			System.out.println("You r not experienced");
		}

		

	}

}
