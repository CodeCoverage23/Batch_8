package game;

import java.util.Random;
import java.util.Scanner;


public class MyGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 0 for Rock, 1 for paper, 2 for scissor ");
		int userInput = sc.nextInt(); 
		
		Random r = new Random();
		int computer = r.nextInt(3);
		
		if(userInput==computer) {
			System.out.println("Draw");
		}else if (userInput==0 && computer==2 || userInput==1 && computer==0 || userInput==2 && computer==1) {
			System.out.println("you win!");
		}else {
			System.out.println("computer win");
		}
		System.out.println("computer choice:" + computer);
			
		
		
	
	}

}
