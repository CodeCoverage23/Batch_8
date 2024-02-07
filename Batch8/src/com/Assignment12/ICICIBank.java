package com.Assignment12;

import java.util.Scanner;

public class ICICIBank  extends Bank {
	
	public void getICICIBankDetails() {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the details for icici bank >>");
		
		
		System.out.println("principal amount>> ");
		double principleAmount = sc.nextDouble();
		
		System.out.println("tenure>> ");
		int tenure = sc.nextInt();
		System.out.println("rate of interest>>");
		float rateOfIntrest = sc.nextFloat();
		float rateOfInterest = 0;
		double calculateInterest = getCalculateInterest(principleAmount , tenure , rateOfInterest);
		System.out.println("simple interest for ICIIC bank>> "+calculateInterest); 
		
	
		}
	
	private double getCalculateInterest(double principleAmount , int tenure , float rateOfInterest) {
		
		double interest = (principleAmount*tenure*rateOfInterest)/100;
		
		return interest;
	}
}

     // child class
      
     class SavingAccout extends Account {
    	 
    	 String accountType;
    	 long balance;
    	 
     
     

     
     //get saving Account details
     public void getSavingAccountDetails() {
    	 System.out.println("Enter the Account Type>>"); 
    	 Scanner sc = new Scanner(System.in);
    	 String Type = sc.next();
    	 System.out.println("Enter the balance>>");
    	 balance = sc.nextLong();
    	 getSavingAccountInformation(accountType, balance);
     }
     
     //print the saving account details
     
     public void getSavingAccountInformation (String accType , long balance) {
    	 
    	 System.out.println("AccountType : accType");
    	 
    	 System.out.println("Balance : +balance");
     }
     
   }
