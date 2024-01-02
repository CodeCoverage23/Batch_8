package com.comments.constructor;

public class ParameterizedConstStudent {

	int rollNo;
	String name;

	public ParameterizedConstStudent(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public void display() {
		System.out.println("Roll Number : " + rollNo);
		System.out.println("Name : " + name);
	}

}
