package com.java.assignment5;

//3.write a program to find out maximum number among 
//three number(if else if ladder statement)
public class MaxAmong3 {

	public static void main(String[] args) {
		int n1 = 15, n2 = 9, n3 = 5;

		if (n1 >= n2 && n1 >= n3)
			System.out.println(n1 + " is the largest number.");

		else if (n2 >= n1 && n2 >= n3)
			System.out.println(n2 + " is the largest number.");

		else
			System.out.println(n3 + " is the largest number.");

	}

}
