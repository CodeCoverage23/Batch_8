package com.Assignment5;

import java.util.Scanner;
//Write a program to check the number is positive or negative.

public class CheckNumber {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check positive or not : ");
		
		int num = sc.nextInt();
		
		if (num >= 0) {
			
			System.out.println("the 'given number is positive");
			
		}    else {
			           System.out.println("the given number is negative");
			           
	              }
		
		}

}
