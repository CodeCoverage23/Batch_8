package com.java.assignment6;

import java.util.Scanner;

public class Factorial {
	
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int result = factorial(number);

	        System.out.println("Factorial of " + number + " is: " + result);

	        scanner.close();
	    }

	    // Method to calculate factorial
	    public static int factorial(int no) {
	        if (no == 0 || no == 1) {
	            return 1;
	        } else {
	            return no * factorial(no - 1);
	        }
	    }
	}



