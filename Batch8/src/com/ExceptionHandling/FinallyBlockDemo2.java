package com.ExceptionHandling;

public class FinallyBlockDemo2 {
//only finally block executed when exception not handled
	public static void main(String[] args) {

		try {
			String s= "32.21";
			Integer i=Integer.valueOf(s);
			
		} catch (ArithmeticException e) {
			System.out.println("can not divide by zero");
		} finally {
			System.out.println("I will always execute....");
		}
		System.out.println("rest of the code");
	}
}
