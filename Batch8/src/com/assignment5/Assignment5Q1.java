package com.assignment5;

import java.util.Scanner;

//1 write a program the number is positive or negative
public class Assignment5Q1 {
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if (num == 0) {
			
			System.out.println(num + "is neither posistive nor negative number");
		}
		else if (num > 0) {
			System.out.println(num + "number is positive");
		}
		else {
			System.out.println(num + "number is negative");
		}

	}

}
