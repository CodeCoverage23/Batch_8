package com.java.Assignment5;

import java.util.Scanner;

public class NoGreaterThan100 {

	public static void main(String[] args) {
		System.out.println("Enter a no");
		Scanner sc= new Scanner(System.in);
		int i=sc.nextInt();
		
		if(i>100) {
			System.out.println("No Greater than 100");
		}else if(i<100) {
			System.out.println("The no is smaller than 100");
		}
		else {
			System.out.println("The no is 100");
		}

	}

}
