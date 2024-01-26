package com.java.assignment7;
import java.util.Scanner;

public class CheckCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a input");
		char charAt= sc.next().charAt(0); 
		charType(charAt);
	}

	private static void charType(int ch) {
		if(ch>= 65 && ch<=90) {
			//checking value for capital letter
			System.out.println("It is capital letter alphabet");
			
		}else if(ch >=97 && ch<=122) {
			//checking value for small letter
			System.out.println("It is small letter alphabet");
		}
		else if(ch >=48 && ch<=57) {
			//checking value for number
			System.out.println("It is a number");
		}
		else {
			System.out.println("Enter  a valid input");
			
		}
	}
	

}
