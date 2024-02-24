package com.java.assignment7;


import java.util.Scanner;
public class CheckCharacters {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a character: ");
	        char character = scanner.next().charAt(0);

	        checkCharacterType(character);

	        scanner.close();
	    }

	    // Method to check character type
	    public static void checkCharacterType(char ch) {
	        if (Character.isLetter(ch)) {
	            System.out.println(ch + " is an alphabet.");
	        } else if (Character.isDigit(ch)) {
	            System.out.println(ch + " is a digit.");
	        } else {
	            System.out.println(ch + " is a special symbol.");
	        }
	    }
	}


