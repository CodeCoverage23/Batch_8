 package com.java.extra;
//Write a program to print the factorial of 5.
public class FactorialProgram {

	public static void main(String[] args) {
		
		int num = 5;
		int fact = FactorialProgram.fact(num);
		System.out.println("The factorial of " + num + " is : " + fact);

	}
	public static int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {

			fact = fact * i;
		}
		return fact;
	}

	}

