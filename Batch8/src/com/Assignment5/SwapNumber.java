package com.Assignment5;

//write the program to swap number

public class SwapNumber {
	
	
	
	
	public static void main(String[] args) {
		
		//using third number
		int a = 10;
		
		int b = 20;
		
		int temp;
		
		
		System.out.println("the number before swapping");
		
		System.out.println("a :" +a+ " & b : "+b);
		
		temp = a;
		a=b;
		b=temp;
		
		
		System.out.println("the number after swapping");
		System.out.println("a :" +a+ " & b : "+b);
		
		//withought using the third variable
		
		a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		
		System.out.println("the number after swapping");
		System.out.println("a : "+a+" & b : "+b);
	}

}
