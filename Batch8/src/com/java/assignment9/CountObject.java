package com.java.assignment9;

//1. Write the Java program in which create the multiple objects and display 
//the count of number of objects created into class.

public class CountObject {
	static int count = 0;

	// Default constructor
	public CountObject() {
		count++;
	}
	public static void getCount() {
		System.out.println("number of Objects in class is : " + count);
	}

	public static void main(String[] args) {
		CountObject obj1 = new CountObject();
		CountObject obj2 = new CountObject();
		CountObject obj3 = new CountObject();
		CountObject obj4 = new CountObject();
		CountObject obj5 = new CountObject();
		CountObject.getCount();

	}

}
