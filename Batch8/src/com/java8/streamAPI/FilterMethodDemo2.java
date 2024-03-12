package com.java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethodDemo2 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Pavan", "Kishor", "Vijay", "Pratik", "Shubham", "Ankush", "Sachin");

		// Traditional Way
		for (String s : list) {
			int length = s.length();
			if (length > 5)
				System.out.println(s);
		}

		// by using filter method
		List<String> collect = list.stream().filter(e -> e.length() > 5).collect(Collectors.toList());
		System.out.println(collect);

		list.stream().filter(e -> e.length() > 5).collect(Collectors.toList()).forEach(e -> System.out.println(e));

		System.out.println("***************************");

		list.stream().filter(e -> e.length() <= 5).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("++++++++++++++++++++++++++++++");

		List<String> languages = Arrays.asList("Java", null, "Python", "c#", null, "Cpp", ".Net");

		// languages.forEach(System.out::println);

		languages.stream().filter(e -> e != null && e.length() > 3).collect(Collectors.toList())
				.forEach(System.out::println);

	}

}
