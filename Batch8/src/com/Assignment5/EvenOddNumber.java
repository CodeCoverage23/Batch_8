package com.Assignment5;

import java.util.Scanner;
//Write a program to check whether number is even or odd.

public class EvenOddNumber {
	
	
	 public static void main(String[] args) {
				
	        	Scanner sc = new Scanner(System.in);
	        	
	        	System.out.println("Enter a number to check even or odd : ");
	        	
	        	int num = sc.nextInt();
	        	if (num>0) {
	        		
	        		if (num%2==0) {
	        			
	        			System.out.println("the given number is even number");
	        			
                        }
	        		
	        		else {
	        			
	        			System.out.println("the given number is odd number");
	        			
	                }
	        	}
	        	
	        
	       else {
	        		System.out.println("invalid number");
	        		
	   }
	}

}
