package com.Assignment8;

import java.util.Scanner;

public class StudentInformation {
	
	public static void main(String[] args) {

		StudentInformation info = new StudentInformation();
		System.out.println("enter the number of Student :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.println("enter the Student Details>>");
			info.getUserInput();

		}

	}

	public void getUserInput() {

		Student student = new Student();

//		takes the input for multiple students from user

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name>>");
		student.firstname = sc.nextLine();

		System.out.println("Enter the last name>>");
		student.lastName = sc.nextLine();

		System.out.println("Enter the city>>");
		student.city = sc.nextLine();

		System.out.println("Enter the mobile Number>>");
		student.mobileNumber = sc.nextLong();

		getStudentInformation(student.firstname, student.lastName, student.city, student.mobileNumber, Student.country);

	}

	// Pass the input to getStudentInformation() method-parameterized method
//	1.4 Print the multiple student information into getStudentInformation () method.

	public void getStudentInformation(String fName, String lastName, String city, Long mobileNumber, String country) {

		// Printing Student

		System.out.println("student Information : ");
		System.out.println("firstName : " + fName);
		System.out.println("lastName : " + lastName);
		System.out.println("city : " + city);
		System.out.println("mobileNumbe : " + mobileNumber);
		System.out.println("country : " + country);

	}
}


