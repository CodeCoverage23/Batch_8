package com.assignment17;

import java.util.Scanner;

public class FreqOfString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String to get freq of character>>");
		String inputString = sc.nextLine();

		int[] freq = new int[inputString.length()];

		int i, j;

		char[] charArray = inputString.toCharArray();

		for (i = 0; i < inputString.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < inputString.length(); j++) {

				if (charArray[i] == charArray[j]) {
					freq[i]++;
					charArray[j] = '0';
				}
			}
		}

		// this for loop for print the freq of character
		System.out.println("character and their respective freq is >>");
		for (i = 0; i < freq.length; i++) {
			if (charArray[i] != ' ' && charArray[i] != '0') {

				System.out.println(charArray[i]+"-"+freq[i]);

			}
		
	}

}}
