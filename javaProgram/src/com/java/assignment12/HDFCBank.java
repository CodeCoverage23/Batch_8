package com.java.assignment12;


import java.util.Scanner;


public class HDFCBank extends  Bank {
	

	public void getHDFCBankDetails() {
		
		Scanner sc= new Scanner (System.in); 
		System.out.println(" Enter HDFc Bank Details >> ");
		System.out.println(" Enter a Principle Amount : ");
		principleAmount=sc.nextDouble();
		
		System.out.println(" Enter tenure : ");
		tenure=sc.nextInt();
		
		System.out.println(" Enter Rate Of Intrest : ");
		rateOfIntrest=sc.nextFloat();
		
		double Calculateintrest = getCalculateIntrest(principleAmount,tenure,rateOfIntrest);
		System.out.println(" Rate Of Intrest : "+Calculateintrest);
	}

	private double getCalculateIntrest(double principleAmount,int tenure, float rateOfIntrest) {
		
		double Intrest= (principleAmount*tenure*rateOfIntrest)/100;
		return Intrest;
		
	}
}

