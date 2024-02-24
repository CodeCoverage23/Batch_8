package com.collection;

import java.util.Enumeration;

import java.util.Vector;

public class EnumerationDemo {
	
	public static void main(String[] args) {
		
		Vector <String> v = new Vector<String>();
		
		v.add("java");
		v.add("python");
		v.add("golang");
		v.add("scala");
		v.add("jscrpt");
		
		System.out.println(v);
		
		/*
		 * for (string s : v) {string UpperCase = s.toUpperCase();
		 * system.out.println(upperCase); }
		 */
	Enumeration<String> element = v.elements();
	while (element.hasMoreElements()) {
		
		System.out.println(element.nextElement().toUpperCase());
		
	}
	
	System.out.println(v.size());
	}

}
