package com.assignment12;

import java.util.Scanner;
//parent class
   class Account{
	 
	 int accountNumber;
	 String accountName;
	 
   //get account Details
    public void getAccountDetails() {
    	 
    	 Scanner sc =new Scanner (System.in);
    	 System.out.println(" Enter a valid Account Number : ");
    	 accountNumber= sc.nextInt();
    	 
    	 System.out.println(" Enter a Account Name : ");
    	 accountName = sc.next();
    	 getAccountInformation(accountNumber,accountName);
     }
      //print Account Details
       public void getAccountInformation(int accNum,String accName) {
	   
	   System.out.println("AccountNumber : "+ accNum);
	   System.out.println("AccountName : " + accName);
    	 
     }

 }
// child class
   class SavingAccount extends Account{
	   String accountType;
	   long balance;
	   
   
   public void getSavingAccountDetails() {
	   System.out.println(" Enter a Account type : ");
	   Scanner sc = new Scanner (System.in);
	   accountType=sc.next();
	   
	   System.out.println(" Enter Balance : ");
	   balance=sc.nextLong();
	   getSavingAccountInformation(accountType,balance);
   }
    public void getSavingAccountInformation( String accType,long balance) {
    	
    	System.out.println(" Account Type : "+ accType);
    	System.out.println(" Balance " + balance);
    }
      }
   
    public class Test {

	public static void main(String[] args) {
		
		SavingAccount acc = new SavingAccount()	;
		acc.getAccountDetails();
		acc.getSavingAccountDetails();
	}
}


   