package com.java.assignment6;


	
	import java.util.Scanner;

	public class FactorialRecursion {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int result = factorial(number);

	        System.out.println("Factorial of " + number + " is: " + result);

	        scanner.close();
	    }

	    
	    public static int factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * factorial(n - 1);
	        }
	    }
	}

