package com.Assign7;
//2. Design method public int getNumberCube(int num),
//return int value to that method and result should be into main method.

import java.util.Scanner;

public class Que2 {
	public int getNumberCube(int num) {
		int cube=num*num*num;
		return cube;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find its cube : ");
		int num = sc.nextInt();
		Que2 s= new Que2();
		int result=s.getNumberCube(num);
		System.out.println("Cube of "+num +" is "+result);
		sc.close();
	}

}
