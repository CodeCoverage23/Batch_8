package com.java.assignment5;
//5. Write a program to check whether number is even or odd.
import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to check even or odd : ");

		int num = sc.nextInt();
		if(num>0) {
		
		if(num%2==0) {
			
			System.out.println("the gievn number is even number");
		}
		
		else {
			
			System.out.println("the given number is odd number");
		}
		}
		else
		{
		System.out.println("invalid number");	
			
			
		}
	}

}
