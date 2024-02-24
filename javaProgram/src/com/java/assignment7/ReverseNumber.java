package com.java.assignment7;

import java.util.Scanner;
public class ReverseNumber {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        int reverse = getReverseNumber(number);

	        System.out.println("Reverse of " + number + " is: " + reverse);

	        scanner.close();
	    }

	    
	    public static int getReverseNumber(int num) {
	        int reversedNumber = 0;
	        while (num != 0) {
	            int digit = num % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            num /= 10;
	        }
	        return reversedNumber;
	    }
	}



