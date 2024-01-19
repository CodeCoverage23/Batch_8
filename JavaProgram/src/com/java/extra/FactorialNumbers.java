package com.java.extra;

import java.util.Scanner;

public class FactorialNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int fact = FactorialNumbers.fact(num);
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


