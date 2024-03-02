package com.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {

		TreeMap<Integer, String> t = new TreeMap<>();

		t.put(104, "A");
		t.put(112, "D");
		t.put(102, "K");
		t.put(101, "O");
		t.put(106, "P");
		t.put(105, "P");
		t.put(107, "P");
		t.put(103, "P");
		t.put(111, "P");

		System.out.println(t);

		// it will return the entries less than the give key
		SortedMap<Integer, String> headMap = t.headMap(106);
		System.out.println(headMap);

		// it will return the entries greater than equal to
		System.out.println(t.tailMap(106));

		// it will return entries in bet the given keys
		System.out.println(t.subMap(102, 106));
	}

}
