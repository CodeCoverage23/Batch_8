package com.task;

import java.util.Scanner;

public class Factorial {
	
	public static int fact(int i) {
		int fact=1;
		
		if(i==0 || i==1) {
			return 1;
		}
		return i*fact(i-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=10;i++) {
			System.out.println(i + "! = "+fact(i));
		}
	}

}
