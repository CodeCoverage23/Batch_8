package com.Assignment6;

import java.util.Scanner;

public class Multiplicationtable {

	public static void printMultipictionTable( int num) {
		
		for (  int i = 1; i <= 10; i++) {
			 
			System.out.println( num + " * " + i + " = " + num *i);
		}
	}
	
	public static void main(String[] args) {
		 Scanner sc =new Scanner ( System.in);
		
		 System.out.print(" Enter any number to print its table ");
		 
		 int num= sc.nextInt();

		 printMultipictionTable(num);
	}

}
