package com.java.assignment10;

import java.util.Scanner;

//Write a java program to check whether number is armstrong or not.

public class Armstrongnumber {
	
	public static void main(String[] args) {
	
			Scanner sc =new Scanner(System.in);
			System.out.println("enter a number to check if it is armstrong number or not");
			int count=0; int checknumber; int lastDigit; double total = 0;
			int originalNumber = sc.nextInt();
			
			int tempNumber=originalNumber;
			
			// Step 1 ; count the digits in nnumber
			
			while(tempNumber>0) {
				
				tempNumber=tempNumber/10;
				count++;
		}
			
			
	// step 2 : get the last digit and calculate the power and total
			
			checknumber=originalNumber;
			
			while(checknumber>0) {
				
				lastDigit=checknumber%10;
			
				double pow = Math.pow(lastDigit,count);
				
				//lastdigitmulti = last digit"count";
				total=total+pow;
				
				checknumber=checknumber/10;
			}
			
			if(total==originalNumber) {
				
				System.out.println("the number " +originalNumber+"is an armstrongnumber");
			}
			else {
				System.out.println("the number"+originalNumber+"is not an armstrongnumber");
			}
			
			
			
		}

}
