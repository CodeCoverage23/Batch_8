package com.collection;

import java.util.Comparator;

public class ComparatorEmployee implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e2.getSalary()-e1.getSalary();
	}

}
