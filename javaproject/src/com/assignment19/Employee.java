package com.assignment19;

public class Employee {

	private int id;
	private String name;
	private String mobileNumber;
	private String email;
	private String address;

	public Employee(int id, String name, String mobileNumber, String email, String address) {

		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.address = address;

	}

	public void display() {

		System.out.println("id : " + id);
		System.out.println("Name : " + name);
		System.out.println("MobileNumber : " + mobileNumber);
		System.out.println("email : " + email);
		System.out.println("Address: " + address);
	}

}
