package com.java.assignment2;

public class GlobalVariable {

	    
	    private static int y;

	    public static void main(String[] args) {
	        
	        System.out.println("The value of y: " + y);

	        
	        y = 42;

	       
	        System.out.println("The modified value of y: " + y);

	        
	        anotherMethod();
	    }
            private static void anotherMethod() {
	        System.out.println("Accessing y from another method: " + y);
	    }
	}


