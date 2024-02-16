package com.Assign17;
//2. Design the java method for String getReverseString(String reverse) and take 
//the input from user into main method and pass to that method. Result will print into main method

import java.util.Scanner;

public class Q2ReverseString {
	public String getReverseString(String input) {
	String reverse="";
	for(int i=input.length()-1;i>=0;i--) {
		reverse+=input.charAt(i);
	}
	return reverse;
	}

	public static void main(String[] args) {
		Q2ReverseString rev=new Q2ReverseString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String input=sc.nextLine();
		String reverse=rev.getReverseString(input);
		System.out.println("Reverse of "+input+" is "+reverse);
		
	}

}
