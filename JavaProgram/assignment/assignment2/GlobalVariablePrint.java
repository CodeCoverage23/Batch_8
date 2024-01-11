package com.java.assignment2;
// Write the Java Program to print the global variable value as 25.
public class GlobalVariablePrint {

	int y = 25;

	public static void main(String[] args) {

		GlobalVariable obj = new GlobalVariable();
        
		obj.y =25;
		
		System.out.println(obj.y);

	}

}
