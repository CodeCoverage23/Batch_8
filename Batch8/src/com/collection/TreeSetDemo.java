package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> t = new TreeSet<>();

		t.add(100);
		t.add(10);
		t.add(200);
		t.add(20);
		t.add(30);
		t.add(50);

		System.out.println(t);

		List<Integer> list = new ArrayList<>(t);

		list.add(2);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(5);
		list.add(8);
		list.add(1);
		list.add(9);
		list.add(45);
		list.add(55);
		list.add(100);
		list.add(963);

		TreeSet<Integer> ts = new TreeSet<>(list);

		System.out.println(ts);

		ArrayList<Integer> evenNumberList = new ArrayList<Integer>();
		ArrayList<Integer> oddNumberList = new ArrayList<Integer>();

		// by iterator

		/*
		 * Iterator<Integer> itr = ts.iterator();
		 * 
		 * while (itr.hasNext()) {
		 * 
		 * Integer data = itr.next();
		 * 
		 * if (data % 2 == 0) { evenNumberList.add(data); } }
		 */

		// by for each loop

		for (Integer i : ts) {
			if (i % 2 == 0) {
				evenNumberList.add(i);
			} else {
				oddNumberList.add(i);
			}
		}

		System.out.println(evenNumberList);
		System.out.println(oddNumberList);
	}

}
