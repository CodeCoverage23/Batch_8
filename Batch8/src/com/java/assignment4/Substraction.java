package com.java.assignment4;

//Write the java program to design method for substraction of two number 
//which returns int value to that method and result should be print into main method.
public class Substraction {

	public static void main(String[] args) {
		Substraction obj = new Substraction();
		System.out.println(obj.sub(40, 15));

	}

	public int sub(int a, int b) {
		int c = a - b;
		return c;

	}

}
