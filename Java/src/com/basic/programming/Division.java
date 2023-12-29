package com.basic.programming;

import java.util.Scanner;

public class Division {
	public static int div(int a, int b) {
		int div = a / b;
		return div;
	}

	public static void main(String[] args) {
		int a, b, div;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		div = div(a, b);
		System.out.println("Divison of two numbers is:" + div);
	}
}
