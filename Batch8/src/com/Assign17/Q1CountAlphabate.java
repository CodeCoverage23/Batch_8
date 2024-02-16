package com.Assign17;

import java.util.Scanner;

//1. Design a method for counting the alphabet, vowels and numbers from String. 
//Input should be from user into main method and pass that to methods. And result will print into main method 

public class Q1CountAlphabate {
	public int countAlphabate(String input) {
		int countAlpha=0;
		
		for(int i=0;i<input.length();i++) {
			if((input.charAt(i)>='A'&&input.charAt(i)<='Z')||(input.charAt(i)>='a'&&input.charAt(i)<='z')) {
				countAlpha++;
			}
		}
		return countAlpha;
	}
	public int countVowels(String input) {
		int countVowel=0;
		
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='A'||input.charAt(i)=='E'||input.charAt(i)=='I'||input.charAt(i)=='O'||input.charAt(i)=='U'||input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='i') {
				countVowel++;
			}
		}
		return countVowel;
	}
	public int countNumber(String input) {
		int countNumber=0;
		
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)>='0'&&input.charAt(i)<='9') {
				countNumber++;
			}
		}
		return countNumber;
	}

	public static void main(String[] args) {
		Q1CountAlphabate a=new Q1CountAlphabate();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String input=sc.nextLine();
		int countAlpha=a.countAlphabate(input);
		int countVowel=a.countVowels(input);
		int countNumber=a.countNumber(input);
		
		System.out.println("Count of Alphabates : "+countAlpha);
		System.out.println("Count of Vowels : "+countVowel);
		System.out.println("Count of Numbers : "+countNumber);
		

	}

}
