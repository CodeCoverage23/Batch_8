package com.Assignment5;

//Write a program to print month of year. Case 1 January case 2 February case n....use switch case

public class SwitchProgram {
	
	
	               
	
	            public static void main(String[] args) {
					int num = 10;
					String month = "";
					
					switch (num) {
					
					case 1:
						month = "January";
						break;
						
					case 2:
						month = "February";
						break;
						
					case 3:
						month = "March";
						break;
						
					case 4:
						month = "April";
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
						month = "September";
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
						
						default:
							System.out.println("please enter a valid number");
							
					}
					      System.out.println(month);
				}
	
}
	
	
	

