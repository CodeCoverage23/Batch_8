package com.java.program;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	/*Suppose I have Map<String,Integer> contain key as Ram, Sohan, Ashok, Ajay, Prasanna and 
	 * value is 3,2,1,6,5 now I want to sort the value from map and print it.*/

	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.Map.Entry;

	public class SortMap {

		public static void main(String[] args) {

			Map<String, Integer> m = new HashMap<>();

			m.put("Ram", 3);
			m.put("Soham", 2);
			m.put("Ashok", 1);
			m.put("Ajay", 6);
			m.put("Prasanna", 5);

			List<Map.Entry<String, Integer>> list = new ArrayList<>(m.entrySet());

			Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

				@Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

					return o1.getValue().compareTo(o2.getValue());
				}
			});

			System.out.println("After Sorting...");
			for (Map.Entry<String, Integer> entry : list) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}

		}

	}

