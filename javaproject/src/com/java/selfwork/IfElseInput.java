package com.java.selfwork;

import java.util.Scanner;

public class IfElseInput {

	public static void main(String[] args) {
		
		int a, b ,c;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("ENTER ANY TWO NUMBER");
		
		a= sc.nextInt();
		b= sc.nextInt();
		c= a-b;
		
		System.out.println(" Substraction =  "+ c);
		
		if (c>0) {
			System.out.println(" the number is positive");
		} else if(c<0) {
			System.out.println(" the number is negative");
		} else {
			System.out.println("the number is ZERO");
		}
		
		

	}

}
