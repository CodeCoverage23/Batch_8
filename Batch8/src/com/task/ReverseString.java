package com.task;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		String reverse ="";
		int l=s.length();
		for(int i=l-1;i>=0;i--) {
			reverse +=s.charAt(i);
		}
		System.out.println("reveres of "+s+" is "+reverse);

	}

}
