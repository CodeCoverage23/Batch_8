package com.Assign5;

import java.util.Scanner;

//3.write a program to find out maximum number among three number(if else if ladder statement)
public class Que3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers to find out maximum number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a >= b && a >= c) {
			System.out.println(a + " is a maximum number");
		} else if (b >= a && b >= c) {
			System.out.println(b + " is a maximum number");
		} else {
			System.out.println(c + " is a maximum number");
		}

	}

}
