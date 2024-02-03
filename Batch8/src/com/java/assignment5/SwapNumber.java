package com.java.assignment5;

public class SwapNumber {
	
	public static void main(String[] args) {
		//using third variable
		int a=10;
		int b=20;
		int temp;
		
		System.out.println("the number before swapping");
		System.out.println("a :"+a+ "& b :"+b);
		
		
//      temp=a;
//      a=b;
//      b=temp;
//
//      system.out.println("the number after swapping");                                    
//		system.out.println("a :"+a+ "& b :"+b);
//
		
		//without using third variable
		
		a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		System.out.println("the number after swapping");
		System.out.println("a :"+a+ "& b :"+b);
		
	 }
	
}
		
	


