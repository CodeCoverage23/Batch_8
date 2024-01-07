package com.java.selfwork;

import java.util.Scanner;

public class NameMultipleIfElseLadder {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println(" Enetr a value to Print Name : ");
		
		int number = sc. nextInt();
		
		for( int i=1; i<=number; i++) {
			
			if ( i%5==0 &&i%6==0) {
				System.out.println( i+": SONAL THOSAR");
				
			} else 
				if( i%5==0) {
					System.out.println( i+ ": SONAL");
				} else 
			if(i%6==0) {
				
				System.out.println( i+ ": THOSAR");
			} else {
			System.out.println(i);
			}
		
	     }

	  }
  }