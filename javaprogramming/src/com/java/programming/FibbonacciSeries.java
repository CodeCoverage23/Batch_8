package com.java.programming;
//Wap to generate fibbonnacci series.
import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number to create fibbonacci series : ");

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

			System.out.println("please enter a valid number");
		}

	}

}
