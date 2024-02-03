package com.java.assignment10;

//Write a java program to display the fibonacci series up to given number.

import java.util.Scanner; 

public class Fibonacciseries {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to creat fibbonacci :");
		
		int num = sc.nextInt();
		
		if (num>0) {
			int n1 = 0;
			int n2 = 1;
			for (int i = 0; 1 < num; i++) {
				System.out.println("n1 + : ");
						
						int n3 =n1 + n2;
						n1 = n2;
						n2 = n3;
					}
			} else {
				System.out.println("not a valid number");
			}
	}

}
