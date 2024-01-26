package com.java.assignment7;

import java.util.Scanner;

   public class CubeOfNumbers {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a no");
    int num=sc.nextInt();
    int cube=getNumberCube(num);
    System.out.println("The cube of "+num+"is :"+cube);
    
	}
   private static int getNumberCube(int num) {
	return num*num*num;
	
}
}
