package com.java.assignment7;

import java.util.Scanner;

//Design method public int getNumberCube(int num), return int value to that method 
//and result should be into main method.

public class NumberCube {

	public static void main(String[] args) {
		int n = 7;
	      System.out.println("Enter a number ::");
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      System.out.println("Cube of the given number is "+(num*num*num));	

	}

}
