package com.assignment4;

//3. Write the java program to design method for multiplication of two number
//which returns int value to that method and result should be print into main method.
public class Multiplication {

	// multiplication of two number
	public int mul(int m, int d) {
		return m * d;
	}

	public static void main(String[] args) {
		Multiplication obj = new Multiplication();// object creation
		int r = obj.mul(8, 9);// method call
		System.out.println("multiplication of two number:" + r);// display output

	}

}
