package com.java.assignment5;
//Write a java program to find out maximum number among three number (if else if ladder statement)
public class GreaterNumber {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 50;
		int c = 20;
		if (a > b && a > c) {
			System.out.println("the greatest number among three number is : + a");
			
		}else if (b > a && b > c) {
			
			System.out.println("the greatest number among three number is : + b");
			
		}else if (c > a && c > b) {
			
			System.out.println("the greatest number among three number is : + c");
			
		} else {
			System.out.println("the given number is invalid");
		}
	
	}

}