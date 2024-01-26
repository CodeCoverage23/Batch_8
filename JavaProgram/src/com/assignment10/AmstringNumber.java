
package com.assignment11;

import java.util.Scanner;
/**
 * check the Armstrong Number
 */

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.print("Enter a Number: ");
		
		int originalNumber =sc.nextInt();
		int count =0;int checkNum;
		int   lastDigit;double total=0;
		
		int tempNum = originalNumber;
		 
		while(tempNum >0) {
			tempNum = tempNum/10;
			count++;
		}
		checkNum = originalNumber;
		while(checkNum>0) {
			
			
			lastDigit =checkNum%10;
			double pow =Math.pow(lastDigit, count);
			
			//lastDigitmulti=lastDigit*count
			total=total+pow;
			
			checkNum=checkNum/10;
			
		}
		if (total==originalNumber) {
			
			System.out.println("the number"+ originalNumber+" is Amstrong Number");
		}
		
		else {
			System.out.println("the number "+ originalNumber+"is not an Armstrong Number");
			
		}
	

	}

}
