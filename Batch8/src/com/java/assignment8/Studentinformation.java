package com.java.assignment8;

import java.util.Scanner;

//Design the class as student information which takes the input for
//Multiple students from user and design method public void getuserInput().
//Country is same for all the students.

public class Studentinformation {
	public static void main(String [] args) {
		
		Studentinformation info = new Studentinformation();
		System.out.println("enter the number of student :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for (int i = 1; i <= number; i++);
		System.out.println("enter the student details>>");
		info.getuserinput();
		
	   }
	
	 
       
	       public void getuserinput( ) {
	    	   
           Student student = new Student();
	
//        takes the input for multiplestudents from user
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.println("enter the first name>>");
	      student.firstname =  sc. nextLine();
	      
	      System.out.println("enter the lastname>>");
	      student.lastname = sc.nextLine();
	      
	      System.out.println("enter the city name>>");
	      student.cityname = sc.nextLine();  
	      
	      System.out.println("enter the mobilenumber>>");
	      student.mobilenumber = sc.nextLong();
	      
	      System.out.println("student.firstname,student.lastmame,student.city,student.mobilenumber,student.country");

	       } 
	 
// pass the input to getStudentinformation() method parameterized method  
//print the multiple student information into getStudentinformation () method.

   public void getstudentinformation(String name,String lastname,String city,long mobilenumber,String country) {
	   
	   //printing student
	   
	   System.out.println("student information:");
	   System.out.println("firstname :" + name);
	   System.out.println("Lastname:" + lastname);
	   System.out.println("mobilenumber :" + mobilenumber);
	   System.out.println("country:" + country);
  
   
       }
}




	       




















