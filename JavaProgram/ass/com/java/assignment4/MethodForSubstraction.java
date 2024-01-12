package com.java.assignment4;
//Write the java program to design method for substraction of two number which returns int results to that method and result should be print into main method.
public class MethodForSubstraction {

	public static void main(String[] args) {

		MethodForSubstraction m = new MethodForSubstraction();
		int i = m.sub(80, 22);

		System.out.println(i);

	}

	public int sub(int a, int b) {
		return a - b;

	}

}
