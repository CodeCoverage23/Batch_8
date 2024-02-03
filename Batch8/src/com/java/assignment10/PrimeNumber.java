package com.java.assignment10;

//Write a program to check whether number is prime or not.

import java.util.Scanner; 

public class PrimeNumber {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a umber to check prime number : ");
		int num = sc.nextInt();
		int count = 0;
		
		if (num > 0) {
			
			for (int i = 1; i <= num; i++) {
				
				if (num % i == 0) {
					count++;
				}
			}
		if (count == 2) {
			
			System.out.println("the number is prime number");
		} else {
			System.out.println("the number is the not prime number");
		}
		
    }
	
		else {
			
			System.out.println("invalid number");
		}
	}

}
