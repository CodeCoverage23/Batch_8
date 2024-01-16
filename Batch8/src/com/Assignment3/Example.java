package com.Assignment3;


//Design the separate method as String getStudentName (String name) which return student name and print it.


public class Example {

	
	String getStudentName (String name) {
		return name;
		
		}
	
	public static void main(String[] args) {
		
		
		Example example = new Example ();
		String studentName = example.getStudentName("Nilima");
		
		System.out.println(studentName);
	}
}

    