package com.assignment7;

import java.util.Scanner;

//4. Design method public int getReverseNumber(int num) 
//which return int value to that method and result print into main method.
public class getReverseNumber {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = sc.nextInt();
		int reverseNumber = getReverseNumber.getReverseNumber(num);
		System.out.println("the reverse number of " + num+  "is :" +reverseNumber);
		
	}
	
	public static int getReverseNumber(int num) {
		int reverse = 0;
		
		while(num!= 0) {
			int lastDigit = num %10;
			reverse = reverse*10;
			reverse = reverse +lastDigit;
			
			num= num/10;
		}
		return reverse;
	}

}
