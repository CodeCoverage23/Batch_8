package com.Assignment5;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		System.out.println(" enter number to check even or odd");
		Scanner sc= new Scanner( System.in);
		 
		  int number = sc.nextInt();
          if ( number >0) {
	 if (number%2==0) {
		 System.out.println(" the given number is even");
		 
	 }else {
		 System.out.println("the given number is odd");
	 }
      }
     else {
		 System.out.println(" the number is invalid");
	 
 
	}

	  }
	    }
