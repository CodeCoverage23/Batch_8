package com.Assignment19;


public class Employee {
	private int id;
	private String name;
	private String email;
	private String mobileNumber;
	private String address;

	
	public Employee(int id, String name, String email, String mobileNumber, String address) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.address = address;

	}

	public void display() {

		System.out.println("Id:" + id);
		System.out.println("EmpName:" + name);
		System.out.println("EmpEmail:" + email);
		System.out.println("EmpMobNo:" + mobileNumber);
		System.out.println("EmpAddress:" + address);
	}

}


