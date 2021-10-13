package com.company;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Game Rock Paper Scissor!");
		System.out.println("For Rock choose 0 \nFor Paper choose 1\nFor Scisoor choose 2");
		int input;
		Scanner sc=new Scanner(System.in);
		input=sc.nextInt();
		Random rand = new Random();
		int random = rand.nextInt(3);
		System.out.println(random);
		
		if(input==random) {
			System.out.println("tie");
		}
		else if(input==1 && random==2) {
			System.out.println("Computer wins");
		}
		else if(input==1 && random==0) {
			System.out.println("Human wins");
		}
		else if(input==0 && random==1) {
			System.out.println("Computer wins");
		}
		else if(input==0 && random==2) {
			System.out.println("Human wins");
		}
		else if(input==2 && random==0) {
			System.out.println("Computer wins");
		}
		else if(input==2 && random==1) {
			System.out.println("Human wins");
		}
		
		
		
		
		
		

	}

}
