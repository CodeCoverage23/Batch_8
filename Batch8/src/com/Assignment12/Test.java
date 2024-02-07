package com.Assignment12;

import java.util.Scanner;
	//parent class
	class Account{

		int accountNumber;
		String accountName;
		// get the account details
		public void getAcccountDetails() {
			System.out.println("Enter the Account Number>>");
			Scanner sc =new Scanner(System.in);
			accountNumber=sc.nextInt();
			System.out.println("enter the Account name>>");
			accountName=sc.next();
			getAccountInformation(accountNumber, accountName);

		}
		 //print the account details
		public void getAccountInformation(int accNum,String accName) {

			System.out.println("Account Number : "+accNum);
			System.out.println("Account Name : "+accName);

		}





	}
	// child class
	class SavingAccount extends Account{

		String accountType;
		long balance;


		// get saving Account details
		public void getSavingAccountDetails() {
			System.out.println("Enter the Account Type>>");
			Scanner sc =new Scanner(System.in);
	         accountType=sc.next();
	         System.out.println("Enter the Balance>>");
	         balance=sc.nextLong();
	         getSavingAccountInformation(accountType, balance);
		}

		//print the saving account details

		public void getSavingAccountInformation(String accType, long balance) {

			System.out.println("AccountType : "+accType);
	        System.out.println("Balance : "+balance);


		}


      // main class
	
		public class Test {
			
		}
		public static void main(String[] args) {

			SavingAccount saveAcc= new SavingAccount();

			saveAcc.getAcccountDetails();
			saveAcc.getSavingAccountDetails();


		}

	}


