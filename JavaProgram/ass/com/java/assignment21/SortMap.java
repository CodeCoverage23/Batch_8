package com.java.assignment21;

//Suppose I have Map<String,Integer> contain key as Ram, Sohan, Ashok, Ajay, Prasanna and value is 3,2,1,6,5 now I want to sort the value from map and print it.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMap {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("Ram", 3);
		map.put("Soham", 2);
		map.put("Ashok", 1);
		map.put("Ajay", 6);
		map.put("Prasanna", 5);

		System.out.println("Before Sorting " + map);

		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				return o1.getValue().compareTo(o2.getValue());
			}
		});

		System.out.println("After Sorting Map on basis of values >> ");
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " : " + entry.getValue());

		}

	}
}
