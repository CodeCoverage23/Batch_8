package com.Assignment23;

import java.util.Comparator;

import com.Assignment7.Student;

public class SalaryComparator  implements Comparator<Student> {
	
	public int compare1(Student o1, Student o2) {

		return (int) (o1.salary - o2.salary);
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}
 
	
	 


}

