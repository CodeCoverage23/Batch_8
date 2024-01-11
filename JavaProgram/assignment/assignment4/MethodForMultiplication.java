package com.java.assignment4;
//Write the java program to design method for multiplication of two number which returns int results to that method and result should be print into main method.
public class MethodForMultiplication {

	public static void main(String[] args) {
		
		MethodForMultiplication m = new MethodForMultiplication();
		int i = m.mul(60, 8);

		System.out.println(i);

	}

	public int mul(int a, int b) {
		return a * b;

	}

}
