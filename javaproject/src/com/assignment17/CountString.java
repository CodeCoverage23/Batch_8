package com.assignment17;

import java.util.Scanner;

public class CountString {

	private int countAlphabet;
	private int countVowel;
	private int countNumber;

	public int getAlphabetCount(String inputData) {

		for (int i = 0; i < inputData.length(); i++) {

			if ((inputData.charAt(i) <= 'Z' && inputData.charAt(i) >= 'A')
					|| (inputData.charAt(i) <= 'z' && inputData.charAt(i) >= 'a')) {
				
				countAlphabet++;
			}

			
		}
		return countAlphabet;
	}

	public int getVowelCount(String inputData) {

		for (int i = 0; i < inputData.length(); i++) {

			if ((inputData.charAt(i) == 'a' || inputData.charAt(i) == 'e' || inputData.charAt(i) == 'i'
					|| inputData.charAt(i) == 'o' || inputData.charAt(i) == 'u')
					|| inputData.charAt(i) == 'A' || inputData.charAt(i) == 'E' || inputData.charAt(i) == 'I'
							|| inputData.charAt(i) == 'O' || inputData.charAt(i) == 'U') {
				
				countVowel++;
			}

		}
		return countVowel;

	}

	public int getNumberCount(String inputData) {

		for (int i = 0; i < inputData.length(); i++) {

			if (inputData.charAt(i) >= '0' && inputData.charAt(i) <= '9') {
			
			countNumber++;
			}
		}
		return countNumber;
	}

	public static void main(String[] args) {

		CountString count = new CountString();
	
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Input >>  ");
		String inputData = sc.nextLine();

		int alphabetcount = count.getAlphabetCount(inputData);
		System.out.println("Alphabet count in given String : " + alphabetcount);

		int vowelcount = count.getVowelCount(inputData);
		System.out.println("Alphabet count in given String : " + vowelcount);

		int numberCount = count.getNumberCount(inputData);
		System.out.println("Number count in given String : " + numberCount);

	}

}
