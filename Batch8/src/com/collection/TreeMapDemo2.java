package com.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 {

	public static void main(String[] args) {

		Map<String, Integer> t = new TreeMap<>(new MyComparator());

		t.put("AA", 111);
		t.put("DD", 222);
		t.put("ZZ", 131);
		t.put("BB", 141);
		t.put("LL", 551);
		t.put("CC", 191);

		System.out.println(t);

	}

}

class MyComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		return o2.toString().compareTo(o1.toString());
	}

}