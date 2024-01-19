package com.java.programmingpp;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number to check if it is armstrong number or not : ");
		int count=0; int checkNumber; int lastDigit;double total=0;
		int originalNumber = sc.nextInt();
		
		int tempNumber=originalNumber;
		
		// Step 1: count the digits in number
		
		while(tempNumber>0) {
			
			tempNumber=tempNumber/10;
			count++;
		}
		
		
		// step 2 : get the last digit and calculate the power and total
		
		checkNumber=originalNumber;
		
		while(checkNumber>0) {
			
			lastDigit=checkNumber%10;
			
			double pow = Math.pow(lastDigit, count);
			
			//lastDigitmulti=lastDigit*count;
			total=total+pow;
			
			checkNumber=checkNumber/10;
		}
		
		if(total==originalNumber) {
			
			System.out.println("the number "+originalNumber+" is an ArmStrongNumber");	
		}
		else {
			System.out.println("the number "+originalNumber+" is not an ArmStrongNumber");
		}
		
		
		
	}



	}


