package com.assignment23;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
		return  (int) (s1.salary-s2.salary);
	}

}
