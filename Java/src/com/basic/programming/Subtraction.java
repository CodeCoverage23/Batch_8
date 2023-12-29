package com.basic.programming;

import java.util.Scanner;

public class Subtraction {
	public static int sub(int a, int b) {
		int sub = a - b;
		return sub;
	}
	public static void main(String[] args) {
		int a,b,sub;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		sub=sub(a,b);
		System.out.println("Subtractionn of two numbers is:"+sub);
	}
}
