package com.assignment7;

/*
 * Design a method public  static void getReverseNumber(int num) which return int value to that
 *  method and result print into main method
 */

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println(" Enter a number to reverse");
       int num = sc.nextInt();
       System.out.println(" Number after Reverse : ");
       getReverseNumber(num);
	}

	public  static void getReverseNumber(int num) {
		
		int reverse = 0;
		while(num> 0) {
			int remender = num % 10;
			reverse = ( reverse * 10) + remender;
			num /= 10;
			
		}
		 System.out.println(reverse);
	}

}
