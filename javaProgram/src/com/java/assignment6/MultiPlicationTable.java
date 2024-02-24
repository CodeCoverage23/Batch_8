package com.java.assignment6;

import java.util.Scanner;
public class MultiPlicationTable {
	
	
      public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        multiplication(number);

	        scanner.close();
	    }

	    // Method to print multiplication table
	    public static void multiplication(int number) {
	        System.out.println("Multiplication table for " + number + ":");

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " * " + i + " = " + (number * i));
	        }
	    }
	}



