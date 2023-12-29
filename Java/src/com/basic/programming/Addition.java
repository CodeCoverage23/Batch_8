package com.basic.programming;

import java.util.Scanner;

public class Addition {
	public static int add(int a, int b) {
		int add = a + b;
		return add;
	}
	public static void main(String[] args) {
		int a, b, add;
		System.out.println("Enter the two numbers for addition:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		add = add(a, b);
		System.out.println("Addition of two numbers is:" + add);

	}

}
