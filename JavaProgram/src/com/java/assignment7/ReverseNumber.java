package com.java.assignment7;
/*
 * 
 */

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no to reverse");
		int num=sc.nextInt();
		System.out.println("No after reverse:");
		getReverseNumber(num);
	}125
	
	public static void getReverseNumber(int num) {
		int reverse=0;
		while(num>0) {
			int reminder = num%10;
			reverse=(reverse*10)+reminder;
			
		}
     System.out.println(reverse);
	}

}
