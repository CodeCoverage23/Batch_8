package com.assignment23;

public class Employee implements Comparable<Employee>{

	int id;
	String name;
	String city;
	
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return this.name.compareTo(e.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	
}
