package com.basic3;

public class Student {

	int rollNo;
	String name;
	static String clgName = "ABC";

	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public Student(int rollNo, String name, String clgName) {
		this.rollNo = rollNo;
		this.name = name;
		this.clgName = clgName;

		System.out.println(rollNo + " " + name + " " + clgName);
	}

	public void display() {
		System.out.println("Roll Number : " + rollNo);
		System.out.println("Name : " + name);
		System.out.println("Clg Name : " + clgName);

	}

	/*
	 * Student(int r, String n) { rollNo = r; name = n; }
	 */

}
