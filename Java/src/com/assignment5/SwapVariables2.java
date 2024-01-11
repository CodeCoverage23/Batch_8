package com.assignment5;

public class SwapVariables2 {
	public static void main(String[] args) {
		int a = 25;
		int b = 625;

		System.out.println("Before Swapping, a = " + a + " and b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping, a = " + a + " and b = " + b);
	}
}
