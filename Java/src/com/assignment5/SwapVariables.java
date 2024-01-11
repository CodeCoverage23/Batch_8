package com.assignment5;

public class SwapVariables {
	public static void main(String[] args) {
		int x = 1001, y = 9001;

		System.out.println("Before Swap");
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		// Swapping Using Third Variable

		int temp = x;
		x = y;
		y = temp;

		System.out.println("After Swap");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
