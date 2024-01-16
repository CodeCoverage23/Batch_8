package com.assignment5;

import java.util.Scanner;

//5. Write a program to check whether number is even or odd.
public class Assignment5Q5 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number even or odd");
		int num = sc.nextInt();
		if(num>0) {
		
		if(num%2==0) 
		{
			System.out.println("the number is a even:" +num);
		}
		else
		{
			System.out.println("the number is odd:" +num);
		}}
		else
		{
			System.out.println("invaild the number");
			
			
		}
		
	}

}
