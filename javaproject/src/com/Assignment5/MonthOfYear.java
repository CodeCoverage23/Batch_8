package com.Assignment5;

import java.util.Scanner;

public class MonthOfYear {

	public static void main(String[] args) {
		System.out.println(" enter a number to print month : ");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		String month = "";
		
		switch(num) {
		case 1: 
			month = " january";
			 break;
		case 2: 
			month = "febuary";
			 break;
		case 3: 
			month =" March ";
			 break;
		case 4: 
			month ="April ";
			 break;
		case 5: 
		   month = "May";
			break;
		case 6: 
			month = "June";
			break;
		case 7: 
			month = "July";
			break;
		case 8: 
			month = "August";
			break;
		case 9: 
			month = "september";
			break;
		case 10:
			month = "October";
			break;
		case 11: 
			month = "November";
			break;
		case 12: 
			month = "December";
			break;
        default : 
				System.out.println(" please enter a valid number");
		}
		      System.out.println(month);
	}

}
