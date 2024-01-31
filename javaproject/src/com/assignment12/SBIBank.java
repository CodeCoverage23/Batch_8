package com.assignment12;

import java.util.Scanner;

//second child class
public class SBIBank extends Bank{

	public void getSBIBankDetails() {
		Scanner sc= new Scanner (System.in);  
		System.out.println(" Enter SBI Bank Account Details>>");
		System.out.println(" Enter principle Amount : ");
	    principleAmount=sc.nextDouble();
	    
	    System.out.println(" Enter tenure : ");
	    tenure=sc.nextInt();
	    
	    System.out.println(" Enter Rate of Intrest : ");
	    rateOfIntrest=sc.nextFloat();
	    //method call
	  double calculteIntrest= getCalculateIntrest(principleAmount,tenure,rateOfIntrest);
	   System.out.println(" Rate Of Intrest : "+calculteIntrest);
	    
	}
	 private double getCalculateIntrest( double principleAmount, int tenure, float rateOfIntrest) {
		
		double intrest=(principleAmount*tenure*rateOfIntrest)/100;
		 return intrest;
		 	 
	 }
	
	}
	
	


