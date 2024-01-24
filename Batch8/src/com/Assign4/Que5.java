package com.Assign4;

import java.util.Scanner;

//Write the Java Program to calculate total of five subject marks and average of it
public class Que5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of follwing 5 subjects :");
		System.out.println("English : ");
		int eng = sc.nextInt();
		System.out.println("Marathi : ");
		int mar = sc.nextInt();
		System.out.println("Math : ");
		int math = sc.nextInt();
		System.out.println("Science : ");
		int sci = sc.nextInt();
		System.out.println("History : ");
		int his = sc.nextInt();

		int total = eng + mar + math + sci + his;
		int avg = total / 5;

		System.out.println("total marks of five subject : " + total);
		System.out.println("Average : " + avg);

	}

}
