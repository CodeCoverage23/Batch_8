package com.java.assignment5;

//Write a program to swap the two numbers.
public class SwapProgram1 {

	public static void main(String[] args) {

		// without using third variable

		int a = 16;
		int b = 80;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("The number after swapping");
		System.out.println("a :" + a + " & b :" + b);
	}

}
