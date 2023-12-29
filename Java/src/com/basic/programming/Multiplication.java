package com.basic.programming;

import java.util.Scanner;

public class Multiplication {
	public static int mul(int a, int b) {
		int mul = a * b;
		return mul;
	}

	public static void main(String[] args) {
		int a, b, mul;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		mul = mul(a, b);
		System.out.println("Multiplication of two numbers is:"+mul);

	}
}
