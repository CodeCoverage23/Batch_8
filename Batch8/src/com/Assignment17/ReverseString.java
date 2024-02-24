package com.Assignment17;

// 2.Design the java method for String getReverseString(String input) and
// take the input from user into main method and pass to that method. result will print into main method.

import java.util.Scanner;

public class ReverseString {
	
	public String getReverseString(String input) {
		
		String reverse ="";
		
		for(int i = input.length()-1; i>=0;i--) {
			
			
			reverse = reverse+input.charAt(i);
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		
		ReverseString reverse = new ReverseString(); 
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the input String>>");
		String input = sc.nextLine();
		
		
		String reverseString = reverse.getReverseString(input);
		System.out.println("reverse of "+input+" is "+reverseString);
	}

}
