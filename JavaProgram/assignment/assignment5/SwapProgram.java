package com.java.assignment5;
//Write a program to swap the two numbers.
public class SwapProgram {

	public static void main(String[] args) {

		// using third variable

		int a = 16;
		int b = 80;
		int temp;

		System.out.println("The number before swapping");
		System.out.println("a :" + a + " & b : " + b);

		temp = a;
		a = b;
		b = temp;
		
		System.out.println("The number after swapping");
		System.out.println("a :"+a+ " & b : "+b);
	}

}
