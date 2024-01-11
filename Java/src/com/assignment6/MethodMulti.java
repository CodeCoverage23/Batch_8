package com.assignment6;

import java.util.Scanner;

public class MethodMulti {
	public static void printMultiTable(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + "=" + num * i);
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = ip.nextInt();

		printMultiTable(num);
	}
}
