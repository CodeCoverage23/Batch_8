package com.assignment2;
//5. Write the java program to print the global variable value as 25.
public class Assignment2Q6 {
	
	int d = 25;
	
	public static void main(String[] args) {
		
		Assignment2Q6 obj = new Assignment2Q6();
		int g = obj.d;
		System.out.println(g);
	}

}
