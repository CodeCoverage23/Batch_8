package com.assignment12;
// first child class

import java.util.Scanner;

public class ICICIBank extends Bank {

	public void getICICIBankDetail() {
		
		Scanner sc= new Scanner (System.in);
		System.out.println(" enter a ICICI Bank Details : ");
		System.out.println(" Enter Principle Amount : ");
		principleAmount=sc.nextDouble();
		
		System.out.println(" Enter a Tenure");
		tenure=sc.nextInt();
		
		System.out.println(" enter Rate of Intrest ");
		rateOfIntrest=sc.nextFloat();
		
		double calculateIntrest=getCalculateIntrest(principleAmount,tenure,rateOfIntrest);
		System.out.println(" Rate Of Intrest :  " + calculateIntrest);
	}
	 private double getCalculateIntrest( double principleAmount, int tenure, float rateOfIntrest) {
		 
		 double intrest = (principleAmount*tenure*rateOfIntrest )/100;
		return intrest;
		  
	 }
}
