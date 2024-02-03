package com.java.assignment7;

import java.util.Scanner;

//1. Design method to check whether the character is alphabet, digit and special symbol.

public class CheckCharacters {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the input to check whether the character is alpjaber, digit and special symbol");
	    char charAt = sc.next().charAt(0);
	    chartype (charAt);
	}

	public static void chartype (int ch) {
		
		if(ch>=65 && ch<90) {
			//checking ascii values for capital letter
			
			System.out.println("it is capital letter alphabet");
			
		}
		else if(ch>97 && ch<122) {
			
			//checking ascii values for small letter
			
			System.out.println("it is small letter alphabet");
			
		}
		else if(ch>=48 && ch<57) {
			//checking ascii values for number
			
			System.out.println("it is a number");
			
			
		}
		else if((ch>=33 && ch<=47)||(ch>=58 && ch<=64)||(ch>=91 && ch<96)||(ch>=123 && ch<=126)) {
			
		
		System.out.println("it is a special character");
		
		}
		else {
			
			System.out.println("incorrect input");
		}
	}

}






















