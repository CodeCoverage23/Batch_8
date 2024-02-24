package com.collection;

import java.util.LinkedList;

import java.util.ListIterator;

public class ListIteratorDemo {
	
	public static void main(String[] args) {
		
		
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("code");
		l.add("java");
		l.add("coverage");
		l.add("program");
		
		System.out.println(l);
		
		ListIterator<String>listIterator = l.listIterator();
		
		while (listIterator.hasNext()) {
			
			String s = listIterator.next();
			
			if(s.equals("code")) {
				listIterator.set("complex part");
				
			}
			
			if (s.equals("program")) {
				listIterator.remove();
				
			}
			System.out.println(l);
		}
		
	}

}
