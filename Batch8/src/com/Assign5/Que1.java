package com.Assign5;

import java.util.Scanner;

//1.write a program to check the number is positive or negative.
public class Que1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		if(n>=0) {
			System.out.println(n+" is a positive number.");
		}
		else {
			System.out.println(n+" is a negative number.");
		}

	}

}
