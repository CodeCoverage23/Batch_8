package com.java.program;

public class Employee1 {
	public String empName;
	  public int empId;
	  public double salary;
	public Employee1() {
		super();
	}
	public Employee1(String empName, int empId, double salary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [empName=" + empName + ", empId=" + empId + ", salary=" + salary + "]";
	}
}
