package com.collection.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumrationDemo {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();

		v.add("java");
		v.add("python");
		v.add("golang");
		v.add("scala");
		v.add("jscript");

		System.out.println(v);

		/*
		 * for (String s : v) { String upperCase = s.toUpperCase();
		 * System.out.println(upperCase); }
		 */

		Enumeration<String> element = v.elements();
		while (element.hasMoreElements()) {
			System.out.println(element.nextElement().toUpperCase());
		}
		System.out.println(v.size());
	}

}
