package com.java.assignment8;

import java.util.Scanner;
/**
 * 
 */

public class StudentInformation {

	public static void main(String[] args) {
		

		StudentInformation info=new StudentInformation();
		System.out.println("enter the no of student:");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			System.out.println("enter the student details >>>");
			info.getUserInput();
			
		}
		
	}
public void getUserInput() {
	   Student student = new Student();
	   //take input for multiple student from user
	   Scanner sc=new Scanner (System.in);
	   
	   System.out.println("Enter the first name>>");
	   student.FirstName=sc.nextLine();

    System.out.println("Enter the last name>>");

	   student.lastName=sc.nextLine();
	   
	   System.out.println("Enter the city >>");
	   student.city= sc.nextLine();
	     
	   System.out.println("Enter the mobile Number");
	   student.mobileNumber=sc.nextLong();

getStudentInfo(student.firstName,student.lastName,student .city,student.mobileNumber,student.country);

public void getStudentInfo(student.firstName,student.lastName,student .city,student.mobileNumber,student.country) {
	
	System.out.println("student info");
}	System.out.println("First Name=" + firstName);
    System.out.println("last Name="+lastName);
    System.out.println("City"+ city);
    System.out.println("Mobile Number"+ mobileNumber);
    System.out.println("Country"+ country);
}

}

