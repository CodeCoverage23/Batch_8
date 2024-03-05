package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new HashMap<>();

		Employee e = new Employee();
		map.put(104, new Employee("sam", "pune", 10000));
		map.put(102, new Employee("sam", "mumbai", 80000));
		map.put(101, new Employee("harry", "banglore", 60000));
		map.put(105, new Employee("sunny", "hydrabad", 50000));
		map.put(103, new Employee("mack", "ranchi", 40000));

		System.out.println(map);

		for (Map.Entry<Integer, Employee> entry : map.entrySet()) {

			System.out.println(entry.getKey() + ":" + entry.getValue());

		}

		System.out.println("Sorting Data on the Basis of Salary of Employee>>");

		List list = new ArrayList(map.values());
		System.out.println("Sorting Data by using Comparable>>");
		Collections.sort(list);
		System.out.println(list);

		System.out.println("Sorting by Using Comparator");
		Collections.sort(list, new ComparatorEmployee());
		System.out.println(list);

	}

}
