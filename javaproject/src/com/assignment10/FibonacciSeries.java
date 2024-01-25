package com.assignment10;

import java.util.Scanner;

/**
 * create FibonacciSeries
 */
public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println(" Enter a Number to Create a Fibonacci series");
		
		int num = sc. nextInt();
		
		if (num>0) {
			int n1 =0;
			int n2 =1;
			
			for (int i =0; i<num; i++) {
				
				int n3 = n1+n2;
				n1 = n2;
				n2 = n3;
				System.out.println(n1 + "  ");
			}
		} 
		else {
			System.out.println(" Enter a Valid Number ");
		}
	}

}
