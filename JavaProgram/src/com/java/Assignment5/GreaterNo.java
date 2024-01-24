package com.java.Assignment5;

public class GreaterNo {

	public static void main(String[] args) {
		
		int a=100;
		int b=60;
		int c=90;
		 
		if(a>b&& a>c) {
			System.out.println("The no greater among three: "+a);
		}
		else if(b>a&& c>b) {
			System.out.println("The no greater among three: "+b);
		}
		else if(c>a&& c>b) {
			System.out.println("The no greater among three: "+c);
		}
		else {
			System.out.println("Invalid no");
	}
	}
}
		


