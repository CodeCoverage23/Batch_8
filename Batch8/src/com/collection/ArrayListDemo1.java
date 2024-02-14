package com.collection;

import java.util.ArrayList;

public class ArrayListDemo1 {
	
	
	public static void main(String[] args) {
		
		
		ArrayList a1 = new ArrayList();
		
		a1.add(10);
		a1.add(18);
		a1.add(10);
		a1.add(null);
		a1.add("java");
		a1.add(12.0);
		a1.add(false);
	
		
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList(a1);
		a2.add(45);
		System.out.println(a2);
		
		
	}
	
	

}
