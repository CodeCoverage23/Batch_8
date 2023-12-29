package com.Assign4;

import java.util.Scanner;

//Write the java program to design method for addition of two number which returns
//int results to that method and result should be print into main method
public class Que1 {
	public static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two values to add : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("the addition of " + a + " and " + b + " is " + add(a, b));

	}

}
