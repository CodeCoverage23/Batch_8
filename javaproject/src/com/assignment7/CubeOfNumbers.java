package com.assignment7;
/**
 * Design a method public  getNumberCube(int num),
 * return int value to that method and result should be into main method.
 */
import java.util.Scanner;

public class CubeOfNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print(" Enter a number to find its Cube");
		int num = sc.nextInt();
		int cube = getNumberCube(num);
		System.out.println(" The Cubr of "+ num +" is : " + cube);
		
	}

	private static int getNumberCube(int num) {
	
		return num * num * num;
	}

}
