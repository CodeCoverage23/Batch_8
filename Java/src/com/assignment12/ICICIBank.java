package com.assignment12;

import java.util.Scanner;

public class ICICIBank extends Bank {

	public void getICICIBankDetail() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a ICICI Bank Details : ");
		System.out.println("Enter Principle Amount : ");
		principleAmount = sc.nextDouble();

		System.out.println("Enter a Tenure");
		tenure = sc.nextInt();

		System.out.println("Enter Rate Of Interest");
		rateOfInterest = sc.nextFloat();

		double calculateInterest = getCalculateInterest(principleAmount, tenure, rateOfInterest);
		System.out.println("Rate of Interest : " + calculateInterest);
	}

	private double getCalculateInterest(double principleAmount, int tenure, float rateOfInterest) {
		double interest = (principleAmount * tenure * rateOfInterest) / 100;
		return interest;
	}

}
