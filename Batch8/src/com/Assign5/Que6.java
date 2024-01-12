package com.Assign5;

import java.util.Scanner;

//Write the program to check whether the no is greater than 100.
public class Que6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether the number is greater than 100 or not : ");
		int n = sc.nextInt();

		if (n > 100) {
			System.out.println(n + " is greater than 100");
		} else {
			System.out.println(n + " is not greater than 100");
		}

	}

}
