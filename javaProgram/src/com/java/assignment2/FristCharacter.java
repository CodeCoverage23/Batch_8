package com.java.assignment2;

public class FristCharacter {

	    public static void main(String[] args) {
	        
	        String name = "YourName";
	        
	        
	        if (!name.isEmpty()) {
	           
	            char firstCharacter = name.charAt(0);
	            System.out.println("The first character of the name is: " + firstCharacter);
	        } else {
	            System.out.println("The name is empty.");
	        }
	    }
	}



