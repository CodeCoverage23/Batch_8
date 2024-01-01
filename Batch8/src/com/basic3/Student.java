package com.basic3;

public class Student {

	int rollNo;
	String name;

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public void display() {
		System.out.println("Roll Number : " + rollNo);
		System.out.println("Name : " + name);
	}

	/*
	 * Student(int r, String n) { rollNo = r; name = n; }
	 */

}
