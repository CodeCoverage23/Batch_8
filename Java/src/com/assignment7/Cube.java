package com.assignment7;

import java.util.Scanner;

/*Design method public int getNumberCube(int num),
 return int value to that method and result should be into main method*/

public class Cube {

	public static int getNumberCube(int num) {
		return num * num * num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int cube = getNumberCube(num);
		System.out.println("The cube of " + num + " is: " + cube);
	}
}
