package com.Assign12;

import java.util.Scanner;

public class ICICIBank extends Bank {
	private double getCalculateInterest(double principleAmount, int tenure,float rateOfInterest) {
		double interest = (principleAmount*tenure*rateOfInterest)/100;
		return interest;
		
	}

	public void getICICIBankDetails() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the details for icici bank : ");
		System.out.println("principal amount : ");
		principleAmount=sc.nextDouble();
		System.out.println("tenure : ");
		tenure=sc.nextInt();
		System.out.println("rate of interest : ");
		rateOfInterest=sc.nextFloat();
		double calculateInterest = getCalculateInterest(principleAmount,tenure,rateOfInterest);
		System.out.println("simple Interest for IcicI Bank : "+calculateInterest);
		

	}
}
