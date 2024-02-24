package com.java.assignment5;
		
		import java.util.Scanner;

public class EvenOddNumber {

	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (number % 2 == 0) {
	            System.out.println("The number entered is even.");
	        } else {
	            System.out.println("The number entered is odd.");
	        }

	        scanner.close();
	    }
	}


