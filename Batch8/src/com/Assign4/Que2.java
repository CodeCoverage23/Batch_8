package com.Assign4;

import java.util.Scanner;

//Write the java program to design method for substraction of two number which returns int value to that method and result
//should be print into main method
public class Que2 {

	public static int sub(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two values to substract : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println( a + "-" + b + "=" + sub(a, b));

	}

}
