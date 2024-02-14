package com.java.assignment17;

import java.util.Scanner;

import com.java.assignment7.Student;

//Design a method for counting the alphabet, vowels and numbers from String. Input should be from user into main method and pass that to methods.
//And result will print into main method 
public class CountingString {
	private int countAlphabet;
	private int countVowel;
	private int countNumber;

	// method for counting alphabet
	public int getAlphabetCounts(String inputData) {

		for (int i = 0; i < inputData.length(); i++) {

			if ((inputData.charAt(i) <= 'Z' && inputData.charAt(i) >= 'A')
					|| (inputData.charAt(i) <= 'z' && inputData.charAt(i) >= 'a')) {
				countAlphabet++;
			}
		}
		return countAlphabet;
	}

	public int getVowelsCount(String inputData) {

		for (int i = 0; i < inputData.length(); i++) {

			if (inputData.charAt(i) == 'a' || inputData.charAt(i) == 'e' || inputData.charAt(i) == 'i'
					|| inputData.charAt(i) == 'o' || inputData.charAt(i) == 'u' || inputData.charAt(i) == 'A'
					|| inputData.charAt(i) == 'E' || inputData.charAt(i) == 'I' || inputData.charAt(i) == 'O'
					|| inputData.charAt(i) == 'U') {

				countVowel++;
			}

		}
		return countVowel;

	}

	public Student getNumberCount(String inputData) {
		for (int i = 0; i < inputData.length(); i++) {

			if (inputData.charAt(i) <= '9' && inputData.charAt(i) >= '0') {

				countNumber++;
			}

		}

		return new Student();
	}

	public static void main(String[] args) {
		CountingString count=new CountingString();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input String>>");
		String inputData = sc.nextLine();
		
		int alphabetCounts = count.getAlphabetCounts(inputData);
		System.out.println("Alphabet count in input String is : "+alphabetCounts);
		
		int vowelsCount = count.getVowelsCount(inputData);
		
		System.out.println("Wovel count in input String is : "+vowelsCount);
		
		 Student numberCount = count.getNumberCount(inputData);
		
		System.out.println("number count in input String is : "+numberCount);


	}

}
