package com.java.assignment7;
//Design method public int getNumberCube(int num),return int value to that method and result should be into main method.
import java.util.Scanner;

public class GetNumberCube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
        int getNumberCube = GetNumberCube.getNumberCube(num);
        System.out.println("Cube of the number " + num + " is "+getNumberCube );
	}

	public static int getNumberCube(int num) {
		int cube =0;
		int i = (int) Math.pow(num, 3);
		 
		return cube;

	}

}