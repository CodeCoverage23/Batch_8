package com.assignment7;

import java.util.Scanner;

//2. Design method public int getNumberCube(int num), 
//return int value to that method and result should be into main method.
public class Assignment7Q2 {

	
	public static int getNumberCube(int num) {
		
		int cube = num*num*num;
		return cube;
	}
	
	public static void main(String[] args ) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number");
	   int k = sc.nextInt();
	   
	   Assignment7Q2 r = new Assignment7Q2();
			   int p = r.getNumberCube(k);
			   System.out.println("cube" +p);
	}
}
