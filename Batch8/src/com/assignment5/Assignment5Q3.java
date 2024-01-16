package com.assignment5;
//3.write a program to find out maximum number among three number(if else if ladder statement)
public class Assignment5Q3 {
	
	public static void main(String[] args) {
		
		int num1 = 66;
		int num2 = 234;
		int num3 = 88;
		
		if(num1>num2 && num1>num3) {
			System.out.println("the maximum number among three number is :" + num1);
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("the maximum number among three number is :" +num2);
		}
		else if(num3>num1 && num3>num2) {
			System.out.println("the maximum number among three number is:" +num3);
		}
		else {
			System.out.println("the number is invalid");
		}
		
	}
	

}
