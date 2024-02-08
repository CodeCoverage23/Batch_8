package com.ExceptionHandling;

public class FinallyBlockDemo3 {
//without catch block
	public static void main(String[] args) {

		try {
			
			System.out.println(10/0);
		} finally {
			System.out.println("I will always execute....");
		}
		System.out.println("rest of the code");

	}

}
