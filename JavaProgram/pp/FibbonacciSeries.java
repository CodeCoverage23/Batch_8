package com.java.programmingpp;
//WAP to generate fibbonacci series.
import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to create fibbonacci series :");

		int num = sc.nextInt();

		if (num > 0) {
			int n1 = 0;
			int n2 = 1;
			for (int i = 0; i < num; i++) {
				System.out.print(n1 + " ");

				int n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
			}
		} else {
			System.out.println("Please enter a valid number");
		}

	}

}
