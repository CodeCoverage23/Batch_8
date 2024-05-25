package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudentObjects {

	public static void main(String[] args) {
		List<Student> l=new ArrayList<>();
		Student s=new Student();
		
		s.setRollNo(102);
		s.setName("jenny");
		s.setAdd("pune");
		
		l.add(s);
		l.add(new Student());
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		System.out.println("*************");
		//Collections.sort(l,new SortByComparator());
		

	}

}
