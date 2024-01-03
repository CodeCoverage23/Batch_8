package com.assignment4;

//1. Write the java program to design method for addition of two number 
//which returns int results to that method and result should be print into main method
public class AddingTwoNumber {

	//Addition of two number
	public int addition(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		AddingTwoNumber obj = new AddingTwoNumber();//object creation
		int p = obj.addition(8, 8);//method call
		System.out.println("Addition of two number: " + p);//display output
	}

}
