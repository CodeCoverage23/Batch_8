package com.assignment8;

import java.util.Scanner;

/* Design the class as Student Information which takes the input for 
 * multiple students from user and design method public void getUserInput(),
 * country is same for all the students.*/

public class StudentInformation {

	public static void main(String[] args) {

		StudentInformation info = new StudentInformation();
		System.out.println("Enter the number of Students:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Enter the Student Details>>");
			info.getUserInput();
		}
	}

	public void getUserInput() {

		Student student = new Student();

		// takes the input for multiple students from user

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First Name>>");
		student.firstName = sc.nextLine();

		System.out.println("Enter the Last Name>>");
		student.lastName = sc.nextLine();

		System.out.println("Enter the City>>");
		student.city = sc.nextLine();

		System.out.println("Enter the Mobile Number>>");
		student.mobileNumber = sc.nextLong();

		getStudentInformation(student.firstName, student.lastName, student.city, student.mobileNumber, Student.country);
	}

	/*
	 * Pass the input to getStudentInformation() method-parametrized method Print
	 * the multiple student information into getStudentInformation() method
	 */

	public void getStudentInformation(String firstName, String lastName, String city, Long mobileNumber,
			String country) {

		// Printing Student

		System.out.println("Student Information:");
		System.out.println("First Name:" + firstName);
		System.out.println("Last Name:" + lastName);
		System.out.println("City:" + city);
		System.out.println("Mobile Number:" + mobileNumber);
		System.out.println("Country:" + country);
	}
}