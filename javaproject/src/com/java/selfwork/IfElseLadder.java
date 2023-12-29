package com.java.selfwork;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		Scanner sc = new Scanner( System.in);
		System.out.println(" ENTER THE NUMBER ");
		int num = sc. nextInt();
		
		
		if( num >0) {
			System.out.println(" the number is positive");
		
		} else if( num < 0) {
			System.out.println(" the number is negative");
			
		}
		else {
			System.out.println("the number is zero");
		}
	}

}
