package com.java.controlstmt;

import java.util.Scanner;

public class IfElseLadderScanner {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the number:");
        int num = Sc.nextInt();
        
        if (num>0) {
        	System.out.println("Positive Number");
        }else 
        	if (num<0) {
        System.out.println("Negative Number");
        }else {

		System.out.println("The number is Zero");

	}
	}
}
