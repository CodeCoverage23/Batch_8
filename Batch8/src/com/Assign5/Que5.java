package com.Assign5;

import java.util.Scanner;

//5. Write a program to check whether number is even or odd.
public class Que5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether a number is even or odd : ");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " is a even number.");
		} else {
			System.out.println(n + " is a odd number.");
		}

	}

}
