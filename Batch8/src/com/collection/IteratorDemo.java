package com.collection;

import java.util.ArrayList;

import java.util.Iterator;

public class IteratorDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(11);
		a1.add(33);
		a1.add(88);
		a1.add(55);
		a1.add(22);
		a1.add(44);
		
		
		Iterator<Integer> itr = a1.iterator();
		while(itr.hasNext()) {
			
			Integer integer = itr.next();
			System.out.println(integer);
		}
		
	}

}
