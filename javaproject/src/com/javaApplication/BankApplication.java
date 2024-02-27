package com.javaApplication;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double accountBalance = 100000.00;
		while (true) {

			System.out.println(" Welcome to MY BANK ");
			System.out.println(" Menu ");
			System.out.println("Press 1 : Deposit ");
			System.out.println("Press 2 : Withrowl ");
			System.out.println("Press 3 : Transfer ");
			System.out.println("Press 4 : Exit ");
			System.out.println("please Press your Choice here >> ");

			int choice = sc.nextInt();

			if (choice == 4) {
				System.out.println("Thanks For Visiting to My Bank ");
				break;
			}
			if (choice == 1) {
				System.out.println(" Enter Amount to be Deposit : ");
				int depositAmount = sc.nextInt();
				if (depositAmount > 0) {
					accountBalance = depositAmount + accountBalance;
					System.out.println(" your Amount is Deposited Succesfully to your Account ");
					System.out.println(" your final Account Balance is = " + accountBalance);
				} else {
					System.out.println(" please enter a valid Deposit Amount");
				}

			} else if (choice == 2) {
				System.out.println(" Enter Amount to be Withdrowl : ");
				int withdrowlAmount = sc.nextInt();
				if (withdrowlAmount <= accountBalance) {
					accountBalance = accountBalance - withdrowlAmount;
					System.out.println("Your Amount is Withdrowl Succesfully. Please collect your Cash.");
					System.out.println(" your Current Account Balance is = " + accountBalance);
				} else {
					throw new InsufficientAmountException(
							" your Account Balance is Insufficient to withdrow your Required Amount ");
				}

			} else if (choice == 3) {
				System.out.println(" Enter Amount to be Transfer : ");
				int transferAmount = sc.nextInt();
				if (transferAmount <= accountBalance) {
					accountBalance = accountBalance - transferAmount;
					System.out.println("your Amountis transferred Succesfully.");
					System.out.println("your curent Account Balance is = " + accountBalance);
				} else {
					throw new InsufficientAmountException(
							" your Account Balance is Insufficient to transfer your Required Amount ");
				}
			} else {
				System.out.println("Invalid Chioce. Please enter a Correct chioce from given Menu ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
