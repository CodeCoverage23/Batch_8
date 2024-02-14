package com.exception;



public class FinallyBlockDemo3 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
			
		} finally {
			System.out.println("finally block is executed");
			
		}
		System.out.println("other code...");
	}

}
