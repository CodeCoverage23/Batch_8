package com.java8.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethodDemo1 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Pavan", "Kishor", "Vijay", "Pratik", "Shubham", "Ankush", "Sachin",
				"Pranay");
		System.out.println(list);

		// convert all the strings in upper case
		List<String> collect = list.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);

		// convert strings in upper case if it starts with P char

		// Traditional way
		List<String> l = new ArrayList<String>();
		for (String s : list) {

			if (s.charAt(0) == 'P') {
				l.add(s.toUpperCase());
			}

		}
		System.out.println(l);

		// convert strings in upper case if it not starts with P char
		list.stream().filter(s -> !s.startsWith("P")).map(s -> s.toUpperCase()).collect(Collectors.toList())
				.forEach(System.out::println);

		long count = list.stream().count();
		System.out.println(count);

	}

}
