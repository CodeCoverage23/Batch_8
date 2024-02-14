package com.exception;

/*
 * 
 * 
 */

public class FinallyBlockDemo1 {
	
	public static void main(String[] args) {
		
		
		try  {
			
			System.out.println(10/0);  
			
		} catch (ArithmeticException e) {
			
			System.out.println("can not divide by zero");
			
		}finally {
			System.out.println("I will always execute...");
		}
		
		System.out.println("rest of the code");
	}

}
