package com.assignment5;

import java.util.Scanner;

public class GreatestOfThree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Three Numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("The greatest among three numbers:"+a);
		}
		else if(b>a && b>c) {
			System.out.println("The greatest among three numbers:"+b);
		}
		else if(c>a && c>b) {
			System.out.println("The greatest among three numbers:"+c);
		}
		else {
			System.out.println("Enter Valid Input...!");
		}
	}

}
