package com.java.assignment7;

import java.util.Scanner;

import java.util.Scanner;

public class FactorNumber {
//3. Design method to print factors of given number( Enter no = 6 then 
//	factors should be displayed like 1,2,3,6.
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		System.out.println("the factors of "+num+ " is :");
		FactorNumber.getNumber(num);

	}

	public static void getNumber(int num) {

		int i = 1;
		while (i <= num) {

			if (num % i == 0) {
				System.out.println(i);
			}

			i++;
		}

	}

}
