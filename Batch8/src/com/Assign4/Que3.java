package com.Assign4;

// Write the java program to design method for multiplication of two number which returns int
//value to that method and result should be print into main method.
import java.util.Scanner;

public class Que3 {
	public static int mul(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two values to multiply : ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a + "*" + b + "=" + mul(a, b));

	}

}
