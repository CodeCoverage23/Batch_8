package com.Collection;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(100);
		al.add(10);
		al.add(null);
		al.add("java");
		al.add(12.0);
		al.add(10);
		al.add(false);
		System.out.println(al);
		
		ArrayList a2=new ArrayList(al);
		a2.add(45);
		System.out.println(a2);
		

	}

}
