package com.java.assignment10;

//Write a java program to display the Fibonacci series up to given number.

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to create fibbonacci series :");

		int num = sc.nextInt();

		if (num > 0) {
			int n1 = 0;
			int n2 = 1;
			for (int i = 0; i < num; i++) {
				System.out.println(n1 + " ");

				int n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
			}
		} else {
			System.out.println("Not a valid number");
		}

	}

}
