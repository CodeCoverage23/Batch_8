package com.assignment7;

import java.util.Scanner;

//1. Design method to check whether the character is alphabet, digit and special symbol.
public class Assignment7Q1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input to check whether the character is alphabet, digit and special symbol.");
		char charAt = sc.next().charAt(0);
		chartype(charAt);
		
	}
	
	public static void chartype(int ch) {
		
		if(ch>=65 && ch<=90) {
			//checking ascii vslues for captial letter
			System.out.println("it is a captial letter alphabet");
		}
		
		else if(ch>=97 && ch<=122) {
			
		//checking ascii values for small letter
	System.out.println("it is a small alphabet");
		}
		
		else if(ch>= 48 && ch<= 57) {
			//checking ascii values for number
			System.out.println("it is a number");
		}
		
		else if ((ch>=33 && ch<= 47) || (ch>=58 && ch<=64) || (ch>= 91 && ch<= 96) ||(ch>=93 && ch<= 126)) {
			// cheking ascii values for special symbol
			System.out.println("it is a special character ");
		}
		else {
			System.out.println("incorrect input");
		}
	}

}
