package com.java8.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMethodDemo1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 21, 32, 25, 65, 45, 25, 58, 95, 90, 22, 44, 85, 63, 32, 34, 84, 84, 12,
				21);

		// 1st way to remove the duplicates
		Set<Integer> collect = list.stream().collect(Collectors.toSet());
		System.out.println(collect);

		// 2nd way
		List<Integer> collect2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect2);

		// Traditional way
		List<Integer> evenList = new ArrayList<Integer>();
		for (Integer i : list) {
			if (i % 2 == 0) {
				evenList.add(i);
			}
		}
		System.out.println("EVEN NUMBER LIST : " + evenList);

		// 1st way with stream API
		List<Integer> filteredListOfEvenNum = list.stream().filter(entry -> entry % 2 == 0).collect(Collectors.toList());
		System.out.println("Filter method even list : " + filteredListOfEvenNum);
		
		// 2nd way
		list.stream().filter(entry -> entry % 2 == 0).collect(Collectors.toList()).forEach(entry -> System.out.println(entry));

		System.out.println("---------------------------------------------------");
		// 3rd way
		list.stream().filter(entry -> entry % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

	}

}
