package com.assignment23;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Student>{

	
	public int compare(Student o1, Student o2) {
		
		return (int) (o1.salary - o2.salary);
	}

}
