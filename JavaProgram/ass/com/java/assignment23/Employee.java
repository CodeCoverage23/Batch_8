package com.java.assignment23;

// Suppose I have Employee class that containing I'd, name and city now I want to sort the data based on comparable interface by using name.

public class Employee implements Comparable<Employee> {

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

		return this.name.compareTo(e.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
