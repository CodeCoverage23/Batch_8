package com.assignment17;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println("Enter any String for Reverse : ");

		ReverseString rev=new ReverseString();
		String reversed =rev.getReverseString();
		
		System.out.println(" Reversed String is : "+reversed);
		
		System.out.println("----------------------------");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Second String for Reverse : ");
		String input=sc.nextLine();
		String second=rev.getReverseString(input);
		System.out.println(" Second Reverse String : "+second);
		
		
	}
 // First method to reverse String 
	public String getReverseString() {

		Scanner sc = new Scanner(System.in);
		String s1;
		s1 = sc.nextLine();

		char c;
		String rvs = "";

		for (int i = 0; i < s1.length(); i++) {

			c = s1.charAt(i);
			rvs = c + rvs;

		}
		return rvs;

	}
	// second method to reverse String
	
	public String getReverseString(String input) {
		
		String reverse="";
		for(int j=input.length()-1;j>=0;j--) {
			
			reverse=reverse+input.charAt(j);	
			
		}
		return reverse;
	}
	
	

}
