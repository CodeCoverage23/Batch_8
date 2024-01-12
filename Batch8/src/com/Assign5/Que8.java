package com.Assign5;

import java.util.Scanner;

//Write a program to swap the two numbers.
public class Que8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to swap: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before Swapping :");
		System.out.println("a=" + a + " and b=" + b);

		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping");
		System.out.println("a=" + a + " and b=" + b);

	}

}
