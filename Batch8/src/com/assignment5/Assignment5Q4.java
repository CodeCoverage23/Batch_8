package com.assignment5;

import java.util.Scanner;

//4.Write a program to print month of year.
//Case 1 January case 2 February case n....use switch case
public class Assignment5Q4 {

	public static void main(String[] args) {
		
		
		Scanner Sc = new Scanner (System.in);
		System.out.println("enter your choice");
		int number = Sc.nextInt();
		//int number = 3;
		//String month = "";
		
		switch(number) {
		
		case 1 :System.out.println("january");
		break;
		
		case 2: System.out.println("february");
		break;
		
		case 3: System.out.println("march");
		break;
		
		default : System.out.println("number is invalid");
		}
	}
	
	
}
