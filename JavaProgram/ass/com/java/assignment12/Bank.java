package com.java.assignment12;

import java.util.Scanner;

public class Bank {

	double principleAmount;
	int tenure;
	float rateOfInterest;

	public static void main(String[] args) {
		
		ICICIBank bank=new ICICIBank();
		bank.getICICIBankDetails();
		System.out.println("********************");
		
		SBIBank bank1=new SBIBank();
		bank1.getSBIBankDetails();
		System.out.println("**********************");
		
		HDFCBank bank3=new HDFCBank();
		bank3.getHDFCBankDetails();
		
	}
}

class ICICIBank extends Bank {

	public void getICICIBankDetails() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details for ICICI bank >>>");
		System.out.println("Principle amount >>>");
		principleAmount = sc.nextDouble();
		System.out.println("Tenure >>>");
		tenure = sc.nextInt();
		System.out.println("Rate of interest >>>");
		rateOfInterest = sc.nextFloat();
		double calculateInterest = getCalculateInterest(principleAmount, tenure, rateOfInterest);
		System.out.println("Simple interest for ICICI Bank >>>>" + calculateInterest);

	}

	private double getCalculateInterest(double principleAmount, int tenure, float rateOfInterest) {
		double interest = (principleAmount * tenure * rateOfInterest) / 100;

		return interest;
	}

}

class SBIBank extends Bank {
	
	public void getSBIBankDetails() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details for SBI bank >>>");
		System.out.println("Principle amount >>>");
		principleAmount = sc.nextDouble();
		System.out.println("Tenure >>>");
		tenure = sc.nextInt();
		System.out.println("Rate of interest >>>");
		rateOfInterest = sc.nextFloat();
		double calculateInterest = getCalculateInterest(principleAmount, tenure, rateOfInterest);
		System.out.println("Simple interest for SBI Bank >>>>" + calculateInterest);		
		
		}
	
	private double getCalculateInterest(double principleAmount, int tenure, float rateOfInterest) {
		double interest = (principleAmount * tenure * rateOfInterest) / 100;

		return interest;
	
	}
	
}
	
	class HDFCBank extends Bank {
		
		public void getHDFCBankDetails() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the details for HDFC bank >>>");
			System.out.println("Principle amount >>>");
			principleAmount = sc.nextDouble();
			System.out.println("Tenure >>>");
			tenure = sc.nextInt();
			System.out.println("Rate of interest >>>");
			rateOfInterest = sc.nextFloat();
			double calculateInterest = getCalculateInterest(principleAmount, tenure, rateOfInterest);
			System.out.println("Simple interest for HDFC Bank >>>>" + calculateInterest);		
			
			}
		
		private double getCalculateInterest(double principleAmount, int tenure, float rateOfInterest) {
			double interest = (principleAmount * tenure * rateOfInterest) / 100;

			return interest;
		
		}
		
		}
	
