package com.Assign8;

import java.util.Scanner;

//1.2 Design the class as Student Information which takes the input for multiple students from user 
//and Design method public void getUserInput(), 
//country is same for all the students.
//1.3 Pass the input to getStudentInformation() method
//1.4 Print the multiple student information into getStudentInformation () method.

public class StudentInformation {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentInformation sinfo=new StudentInformation();
		System.out.println("Enter the number of students : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the student "+i+" details :- ");
			sinfo.getUserInput();
			
		}
		
	}
	public void getUserInput() {
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("Enter the Firstname :");
		s.firstName=sc.nextLine();
		System.out.println("Enter the Lasttname :");
		s.lastName=sc.nextLine();
		System.out.println("Enter the city :");
		s.city=sc.nextLine();
		System.out.println("Enter the mobile number :");
		s.mobileNumber=sc.nextLong();
		
		getStudentInformation(s.firstName, s.lastName, s.city, s.mobileNumber, s.country);
		
	}
	public void getStudentInformation(String firstName, String lastName, String city, Long mobileNumber, String country) {
		System.out.println();
		System.out.println("Student Information : ");
		System.out.println("firstName : " + firstName);
		System.out.println("lastName : " + lastName);
		System.out.println("city : " + city);
		System.out.println("mobileNumber : " + mobileNumber);
		System.out.println("country : " + country);
	}
	

}
