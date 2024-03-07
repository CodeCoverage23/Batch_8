package com.java.program;

public class Employee implements Comparable<Employee>{

  public String empName;
  public int empId;
  public double salary;
public Employee() {
	super();
}
public Employee(String empName, int empId, double salary) {
	super();
	this.empName = empName;
	this.empId = empId;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", empId=" + empId + ", salary=" + salary + "]";
}
//@Override
//public int compareTo(Employee o) {
//
//	return -(this.empId-o.empId);
//}
//@Override
//public int compareTo(Employee o) {
//	// TODO Auto-generated method stub
//	
//	if(empName==o.empName) {
//		return 0;
//	}
//	else if(empName.charAt(0)>o.empName.charAt(0)) {
//		return 1;
//	}
//	else
//		return -1;
//	
//}
@Override
public int compareTo(Employee o) {
	return -empName.compareTo(o.empName);
}
  
  
  
	
	
	
}
