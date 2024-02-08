package com.ExceptionHandling;

public class FinallyBlockDemo1 {
//finally as well as rest of the code executed when exception handled
	public static void main(String[] args) {
		try {
			int i=0,j=0;
			System.out.println(i/j);
		}catch(ArithmeticException e) {
			System.out.println("can not divide by zero");
		}finally {
			System.out.println("I will always execute....");
		}
		System.out.println("rest of the code");
	}

}
