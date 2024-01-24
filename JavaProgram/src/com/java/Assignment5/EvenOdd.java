package com.java.Assignment5;

   import java.util.Scanner;

public class EvenOdd {
   
	
	public static void main(String[] args) {
		System.out.println("Enter a No");

		Scanner sc= new Scanner(System.in);
		
		int num =sc.nextInt();
		if(num>0) {
	  if(num%2==0) {
				System.out.println("The no is Even");
			}
		else {
			System.out.println("The no is Odd");
		}
	}
	else
	{
		System.out.println("Invalid no ");

	}
}
}
