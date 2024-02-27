package com.assignment10;

public class Fibonacciseries {
	
	public static void main(String[] args) {
		
		int num1 = 0; int num2 = 1;
		int count = 5;
		int num3;
		System.out.println(num1+ " "+ num2);
		
		for(int i = 2;i<=count;i++) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num1;
			System.out.println(" " +num3);
		}
	}

}
