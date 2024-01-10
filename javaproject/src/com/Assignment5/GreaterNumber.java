package com.Assignment5;

public class GreaterNumber {

	public static void main(String[] args) {
		
		int a= 100;
		int b= 50;
		int c= 80;

		if( a>b&& a>c) {
			System.out.println(" the number greater among three : " +a);
		} else if (b>a && b>c) {
			System.out.println(" the number greater among three : " +b);
		}else if (c>a&& c>b) {
			System.out.println(" the number greater among three : " +c);
		}else {
			System.out.println(" the number is invalid");
		}
		
		
	}

}
