package com.java.assignment4;

public class Division {
	

	    
	    public static int divide(int numerator, int denominator) {
	        if (denominator == 0) {
	            System.out.println("Error: Cannot divide by zero.");
	            return 0;  
	        }

	        int result = numerator / denominator;
	        return result;
	    }

	    public static void main(String[] args) {
	       
	        int result = divide(10, 3);

	       
	        System.out.println("The result of division is: " + result);
	    }
	}



