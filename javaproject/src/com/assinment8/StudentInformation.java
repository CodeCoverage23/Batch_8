package com.assinment8;

import java.util.Scanner;

/**
 * 
 */
public class StudentInformation {

	public static void main(String[] args) {
	
		StudentInformation info = new StudentInformation();
		System.out.println(" enter the number of student :  ");
		Scanner sc =new Scanner (System.in);
		int num = sc.nextInt();
		
		for (int i= 1; i<= num; i++) {
			System.out.println(" enter the student details >>>> ");
			info.getUserInput();
		}	
		
	}

	public void getUserInput() {
		
		Student student = new Student ();
		
		// take input for multiple student from user
		
		Scanner sc =new Scanner (System.in);
		System.out.println(" Enter the First Name >> ");
		student.firstName = sc.nextLine();
		
		System.out.println(" Enter the Last Name >> ");
		student.lastName = sc.nextLine();
		
		System.out.println(" Enter the City >> ");
		student.city = sc.nextLine();
		
		System.out.println(" Enter the Mobile Number >> ");
		student.mobileNumber = sc.nextLong();
		
		getStudentInformation( student.firstName, student.lastName, student.city, student.mobileNumber , Student.country );
		
	}
	         public void getStudentInformation( String firstName, String lastName, String city, Long mobileNumber, String country ) {
	        	 
	        	 System.out.println(" student information : ");
	        	 System.out.println(" First Name = " + firstName);
	        	 System.out.println(" last Nmae = " + lastName);
		         System.out.println(" City " + city );
		         System.out.println(" Mobile NUmber " + mobileNumber);
		         System.out.println(" country "+ country);
		     }

      }
