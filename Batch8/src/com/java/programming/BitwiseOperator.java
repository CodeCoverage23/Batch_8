package com.java.programming;


public class BitwiseOperator {
	
	public static void main(String[] args) {
		
		int a = 32;  int b = 22;  int c = 42;
		
		 boolean statement= a<++b & b<++c;
		    boolean or=++a>b|a<++c;

//			System.out.println(statement);
			System.out.println(or);

			System.out.println(a);
	        System.out.println(c);
		
		System.out.println();
	}
	
	
	

}
