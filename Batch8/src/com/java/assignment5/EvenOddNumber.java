package com.java.assignment5;
//Write a java program to check whether number is even or odd.
import java.util.Scanner;

public class EvenOddNumber {
	
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("enter a number to check even or odd :");
		
		int sum = Sc.nextInt ();
		int num = 0;
		if(num>0) {
			
			if(num%2==0) {
				
				System.out.println("the given number is even number");
			}
			
			else {
				
			System.out.println ("the given number is odd number");
			}
			}
		else
		{
			System.out.println("invalid number");
			
			
		}
	}
	
}
		
	
	


