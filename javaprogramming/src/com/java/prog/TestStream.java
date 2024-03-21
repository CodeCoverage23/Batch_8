package com.java.prog;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee2{
	
	public int empId;
	public String empName;
	public double Salary;
	public Employee2(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee2 [empId=" + empId + ", empName=" + empName + ", Salary=" + Salary + "]";
	}
	
}



public class TestStream {

	public static void main(String[] args) {

		List<Employee2> empList=new ArrayList<>();
		
		empList.add(new Employee2(103, "shekhar", 50000));
		empList.add(new Employee2(106, "divya", 46000.25));
		empList.add(new Employee2(105, "naresh", 75000.60));
		empList.add(new Employee2(108, "naveen", 87000));
		empList.add(new Employee2(101, "ram", 20000));
		empList.add(new Employee2(104, "chetan", 63000.85));
		empList.add(new Employee2(107, "harsh", 15000));

		System.out.println(empList);
		//stream filter
		List<Employee2> collect = empList.stream().filter(p->p.Salary>15000).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println();
		//stream count
		long count = empList.stream().filter(p->p.Salary>30000).count();
		System.out.println(count);
		System.out.println();

		//stream map
		List<Double> empSalary = collect.stream().map(f->f.Salary-5000).collect(Collectors.toList());
		System.out.println(empSalary);
		System.out.println();

		//stream sorted
		List<Employee2> collect2 = empList.stream().sorted((i1,i2)->i1.empId-i2.empId).collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println();

		//step 1:
		//stream min method
        //	max in this case is your last index
		Optional<Employee2> min = empList.stream().min((i1,i2)->i1.empId-i2.empId);
		System.out.println(min);
		System.out.println();

		// Stream max method
		Optional<Employee2> max = empList.stream().max((i1,i2)->i1.empId-i2.empId);
		System.out.println(max);
		System.out.println();

		
		//Step2:
		List<Employee2> desc = empList.stream().sorted((i1,i2)->-(i1.empId-i2.empId)).collect(Collectors.toList());
		System.out.println(desc);
		System.out.println();

		//stream min method
		// min in this case is your zero index 
		Optional<Employee2> min1 = empList.stream().min((i1,i2)->-(i1.empId-i2.empId));
		System.out.println(min1);
		System.out.println();

		// Stream max method
//		max in this case is your last index
		 Optional<Employee2> max1 = empList.stream().max((i1,i2)->-(i1.empId-i2.empId));
		System.out.println(max1);
		System.out.println();
 
		// for each method
		collect.stream().forEach(p->System.out.println(p));
	       
		
	
	}    

}
