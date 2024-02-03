package com.java.assignment4;

import java.util.Scanner;

public class AverageMarks {
	
	public static void main(String[] args) {
		
		int count, i;
		float totalmarks = 0 , percentage , average;
		Scanner scanner;
		scanner = new Scanner(System.in);
		
		System.out.println("enter the number of subject");
		 
		count = scanner. nextInt();
		
		System.out.println("enter marks of " +count+ "subject");
		for (i = 0; i < count;i++) {
			totalmarks +=scanner.nextInt();
		}
		
		average = totalmarks / count;
		
		//each subject is of 100 marks
		
		percentage = (totalmarks / (count * 100)) * 100;
		 System.out.println("totalmarks :" +totalmarks);
		 System.out.println("percentage :" +percentage);
      
	}

}
