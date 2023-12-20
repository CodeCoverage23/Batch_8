package com.java.programming;

public class LOgicalOperator { 

	public static void main(String[] args) {
		int a=20; int b=30; int c=50;
		
		// Logical AND
		
		Boolean andStatement=a>++b && b<++c;
		System.out.println("Logical and :");
		System.out.println(andStatement);
		System.out.println(b);
		System.out.println(c);
		  System.out.println();
		// Logical OR
		int x=25; int y=35;  int z=40;
		
		Boolean logicalOr=x>++y || y<++z;
		System.out.println("logical OR :");
		System.out.println(logicalOr);
		System.out.println(y);
		System.out.println(z);
		
		
	}
	
	
}
