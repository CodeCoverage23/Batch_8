package com.java.assignment4;
//Write the java program to design method for division of two number which returns int results to that method and result should be print into main method.
public class MethodForDivision {

	public static void main(String[] args) {
		
		MethodForDivision m = new MethodForDivision();
		int i = m.div(10, 5);

		System.out.println(i);

	}

	public int div(int a, int b) {
		return a / b;

	}
//if the division ans is in point then use float in a method.
}
