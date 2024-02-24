package com.exception;


public class ThrowKeywordDemo1 {
	
	public static void main(String[] args) {
		
		String s1 = "code coverage is an institute";
		
		if(s1.length() <=10) {
			throw new StringIndexOutOfBoundsException("String is length is not 10 digits");
			
		}  else {
			System.out.println("we can proceed with the String");
		}
	}

}
