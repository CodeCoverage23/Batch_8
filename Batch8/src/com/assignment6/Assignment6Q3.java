package com.assignment6;

import java.util.Scanner;

//3.write a program  to print all even number from 50 to 75.
public class Assignment6Q3 {
	
	
	public static void main(String[] args) {
		
		//for(int i = 50;i<=75;i=i+2) {
			
	//the number range is 50 to 75
		//System.out.println(i);
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number  range :");
		int number = sc.nextInt();
		System.out.println("the list of even number :" +number+ ":");
		
		for(int i = 50;i<=75;i=i+2) {
			System.out.println(i); 

			
			
		}
	}

}
