package com.java.program;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		return o1.empId-o2.empId;
	}

}
