package com.java.assignment10;
//2. Write a java program to display the Fibonacci series up to given number. 
//(Fibonacci series mean nextnumber is the sum of previous two numbers 
//for example 0,1,1,2,3,5,8,13,21,34,55 etc. If enter no as 5 then output is 0,1,1,2,3).

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter a Number to Create a Fibonacci series");

		int num = sc.nextInt();

		if (num > 0) {
			int n1 = 0;
			int n2 = 1;

			for (int i = 0; i < num; i++) {

				int n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				System.out.println(n1 + "  ");
			}
		} else {
			System.out.println(" Enter a Valid Number ");
		}
	}

}
