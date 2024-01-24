package com.java.assignment8;

//Design the class as Student Information which takes the input for multiple students from user and design method public void getUserInput(), country is same for all the students.

import java.util.Scanner;


public class StudentInformation {

	public static void main(String[] args) {

		StudentInformation info = new StudentInformation();
		System.out.println("Enter the number of Students : ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			System.out.println("Enter the student details - ");
			info.getUserInput();
		}

	}

	public void getUserInput() {

		Student student = new Student();

		// takes the input for multiple students from user

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name - ");
		student.firstName = sc.nextLine();

		System.out.println("Enter the last name - ");
		student.lastName = sc.nextLine();

		System.out.println("Enter the city - ");
		student.city = sc.nextLine();

		System.out.println("Enter the mobile number - ");
		student.mobileNumber = sc.nextLong();

		getStudentInformation(student.firstName, student.lastName, student.city, student.mobileNumber, Student.country);

	}

	// Pass the input to getStudentInformation() method-parameterized method.
	// Print the multiple student information into getStudentInformation() method.

	public void getStudentInformation(String fName, String lName, String city, Long mobileNumber, String country) {

		// Printing Student

		System.out.println("Student Information : ");
		System.out.println("firstName : " + fName);
		System.out.println("lastName : " + lName);
		System.out.println("city : " + city);
		System.out.println("mobileNumber : " + mobileNumber);
		System.out.println("country : " + country);

	}
}
