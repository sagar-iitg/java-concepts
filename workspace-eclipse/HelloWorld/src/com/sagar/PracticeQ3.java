package com.sagar;

import java.util.Scanner;
import java.util.Random;

class Game{
	
	
	//Attributes
	
	private int rand_int;
	
	//Methods
	
	//Constructor Which generate random numbers
	
	 public Game(){
		 Random rand = new Random();
		 rand_int= rand.nextInt(100);
		 
	 }
	 
	 //getters randomNo
	 
	 public int getRandomNo() {
		 return rand_int;
		 
	 }
	 
	 //Take user input 
	 public int userInput() {
		 
			int n;
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			return n;
			
		 
	 }
	
	 
}
public class PracticeQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Please Guess the Number");
		//User Input
		Game g=new Game();
//		System.out.println(g.getRandomNo());
		int count=0;
	
		while(true) {
			count++;

			int user=g.userInput();
			
			if(user==g.getRandomNo()) {
				break;
			}
			else if(user>g.getRandomNo()) {
				System.out.println("You have entered greater number Please Guess again ");
			}
			else {
				System.out.println("You have entered smaller number Please Guess again");
			}
			
			
		}
		System.out.printf("Greetings! you have guessed in %d times",count);
		System.out.println();
		
		
		
		
		

	}

}
