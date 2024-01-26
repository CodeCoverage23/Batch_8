package com.java.assignment7;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int num=sc.nextInt();
		System.out.println("Factors of "+num +":");
		printFactors(num);
	}
	public static void printFactors(int num) {
		int fact =1;
		while(num>=Fact) {
			if(num % Fact==0) {
				System.out.println(Fact);
			}Fact ++;
			
		}
		

	}

}
