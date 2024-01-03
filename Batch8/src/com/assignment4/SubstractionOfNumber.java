package com.assignment4;

//2. Write the java program to design method for substraction of two number
//which returns int value to that method and result should be print into main method.
public class SubstractionOfNumber {

	// substraction of two number

	public int sub(int d, int h) {
		return d - h;
	}

	public static void main(String[] args) {
		SubstractionOfNumber obj = new SubstractionOfNumber();//object creation
		int k = obj.sub(9, 5);//method call
		System.out.println("substraction of two number:" + k);//display output

	}

}
