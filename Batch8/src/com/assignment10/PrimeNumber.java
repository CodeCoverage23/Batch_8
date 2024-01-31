package com.assignment10;

//1. Write Java program to check whether number is prime or not. ( Prime means a number which is
//divisible by only two numbers: 1 and itself. So, if any number is divisible by any other number, it is not a
//prime number.)
public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 5;
		int count = 0;
		if(num>1) {
		 for(int i = 1; i<=num; i++) {
			 if (num % 1 == 0) {
				 count++;
			 }
			 
		 }
		 if(count == 2) {
			 System.out.println("the number is a prime number : ");
		 }
		 else {
			 System.out.println("the number is not a prime number :");
		 }
		  
			
		}else {
			System.out.println("invaild the number");
		}
	}
}
