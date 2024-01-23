package com.assignment7;

import java.util.Scanner;

public class CheckCharacter {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println(" enter a input to checkwhether is alphabet, digit or special symbol");
		char charAt = sc.next().charAt(0);
		charType(charAt);
	}

	private static void charType(int ch) {
	   if (ch >=65 && ch <= 90 ) {
		   //checking the values for capital letter
		   System.out.println(" it is a captial Letter alphabet");
	   }
	   else if(ch >=97 && ch <= 122) {
		   //checking the values for small letter
		   System.out.println(" it is a small Letter alphabet");
	   }
	   else if(ch >=48 && ch <= 57) {
		   //checking the values for number
		   System.out.println(" it is a number");
	   }
	   else if((ch >=33 && ch <= 47)|| (ch>= 58 && ch <= 64)||(ch>=91 && ch<= 96)||(ch>= 123 && ch<= 126)) {
		   //checking the values for special character
		   System.out.println(" it is a special character");
	   }
	   else {
		   System.out.println(" Enter a valid input....");
	   }
	  }	
	}

	
	

