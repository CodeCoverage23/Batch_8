package com.java.program;

import java.util.Scanner;

public class BankMenuDriven {
public static void main(String[] args) {
	double amount=100000.00;
	Scanner sc= new Scanner(System.in);
	while(true) {
		System.out.println("welcome to IDBI bank>>");
		System.out.println("Bank menu>>");
		System.out.println("press 1: Deposit>>");
		System.out.println("press 2 : withdrawl>>");
		System.out.println("press 3 : transfer>>");
		System.out.println("press 4 : exit");
		System.out.println("enter a choice >>");
		
		int choice=sc.nextInt();
		if(choice==4) {
			System.out.println("Thanks for visiting");
			break;
			
		}
		if(choice==1) {
		System.out.println("enter the amount to be deposit");	
		int depositAmount = sc.nextInt();
		if(depositAmount>0) {
			amount=amount+depositAmount;
			System.out.println("your amount deposited SuccessFully ");
			System.out.println("your Total amount is : "+amount);
		}else {
			System.out.println("please enter a valid amount.it is must be positive");
			
		}
	
		}
		else if(choice==2) {
			System.out.println("enter a amount to be withdrawl>>");
			int withdrawlAmount = sc.nextInt();
			if(withdrawlAmount<=amount) {
				amount=amount-withdrawlAmount;
				System.out.println("your amount is successfully withdrawl");
				System.out.println("your total amount is : "+amount);
				
			}
			else {
				throw new InsufficentAmountException("you account balance is insuffient to withdrawl");
			}	
		}
		else if(choice==3) {
			System.out.println("enter a amount to be transfer>>");
			int transferAmount = sc.nextInt();
			if(transferAmount<=amount) {
				amount=amount-transferAmount;
				System.out.println("your amount is successfully transfer");
				System.out.println("your total amount is : "+amount);
				
			}
			else {
				throw new InsufficentAmountException("you account balance is insuffient to transfer");
			}
		
	}else {
		
		System.out.println("invalid choice .please enter a valid choice");
		
	}
		System.out.println();
	}
       sc.close();
}
}
