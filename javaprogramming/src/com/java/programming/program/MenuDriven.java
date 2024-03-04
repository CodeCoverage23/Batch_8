package com.java.programming.program;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		double amount = 50000.00;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("menu : ");
			System.out.println("press 1:");
			System.out.println("press 2:");
			System.out.println("press 3:");
			System.out.println("press 4 :");
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			if (choice == 4) {
				System.out.println("thank you for visiting");
				break;

			}
			if (choice == 1) {
				System.out.println("enter the Amount to be deposit");
				int depositAmount = sc.nextInt();
				if (depositAmount > 0) {
					amount = amount + depositAmount;
					System.out.println("amount deposited successfully");
					System.out.println("Your total Amount is : " + amount);
				} else {

					System.out.println("Invalid Amount.Deposit amount mustbe Positive");
				}
			} else if (choice == 2) {
				System.out.println("enter the Amount to be withdrawl");
				int withDrawlAmount = sc.nextInt();
				if (withDrawlAmount <= amount) {
					amount = amount - withDrawlAmount;
					System.out.println("amount Withdrawl successfully");
					System.out.println("Your total Amount is : " + amount);
				} else {
					throw new InsufficientAmountException("your amount is very low");
				}

			} else if (choice == 3) {
				System.out.println("enter the Amount to be transfer");
				int transferAmount = sc.nextInt();
				if (transferAmount <= amount) {
					amount = amount - transferAmount;
					System.out.println("amount transfer successfully");
					System.out.println("Your total Amount is : " + amount);
				} else {

					throw new InsufficientAmountException("your amount is very low");
				}

			} else {

				System.out.println("invalid Choice. please enter correct choice");

			}
			System.out.println();

		}

		sc.close();

	}

}
