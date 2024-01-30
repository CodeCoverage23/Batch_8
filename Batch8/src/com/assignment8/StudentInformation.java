package com.assignment8;

import java.util.Scanner;

//1.2 Design the class as Student Information which takes 
//the input for multiple students from user and Design method public void getUserInput(), 
//country is same for all the students.
public class StudentInformation {
	
	
	public static void main(String[] args) {
		
		StudentInformation info = new StudentInformation();
		System.out.println("enter the student number :");
		Scanner sc = new  Scanner(System.in);
		int number  = sc.nextInt();
		
		for(int i = 1; i <= number; i++) {
			System.out.println("enter the student details>>");
			info.getUserInput();
		}
		
		
	}
   
	public void getUserInput() {
		
		
		StudentClass Student = new StudentClass();
		//take a input for multiple student from user
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first name>>");
		Student.firstName = sc.nextLine();
		
		System.out.println("enter the lastName>>");
		Student.lastName = sc.nextLine();
		
		System.out.println("enter the cityName>>");
		Student.city = sc.nextLine();
		
		System.out.println("enter the mobileNumber>>");
		Student.mobileNumber = sc.nextLong();
		
		getstudentinformation(Student.firstName, Student.lastName, Student.city, Student.mobileNumber, StudentClass.country);
		

	}
	
//1.3 Pass the input to getStudentInformation() method =(parameterized method)
//1.4 Print the multiple student information into getStudentInformation () method.
	
	public void getstudentinformation(String firstName,String lastName,String city,Long moblieNumber,String country){
		
		//printing students 
		
		System.out.println("firstName :"+firstName);
		System.out.println("lastName :"+lastName);
		System.out.println("city : "+city);
		System.out.println("mobileNumber :"+moblieNumber);
		System.out.println("country :" +country);
		
	}}
		
	
		
		
	

	
	

