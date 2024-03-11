package com.java8.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterMethodDemo1 {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(11,22,32,34,42,32,42,45,65,76,43,75,45,65,44,67,87,98,94);
		
		System.out.println(list);
		//List<Integer> list2=list.stream().distinct().toList();
		
		//1st way to remove the duplicates
		Set<Integer> collect = list.stream().collect(Collectors.toSet());
		System.out.println(collect);
		
		List<Integer> collect2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect2);
		
		//even numbers
		//traditional way
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		for(Integer i:list) {
			if(i%2==0) {
				evenList.add(i);
			}
		}
		System.out.println("Even numbers list : "+evenList);
		
		
		//1st way with stream API
		List<Integer> filteredEvenNo = list.stream().filter(entry->entry%2==0).collect(Collectors.toList());
		System.out.println("Even numbers list : "+filteredEvenNo);
		
		System.out.println("********************************");
		
		//2nd way with Stream API
		 list.stream().filter(entry->entry%2==0).collect(Collectors.toList()).forEach(entry->System.out.println(entry));
		 
		 System.out.println("***********************************");
		 
		 list.stream().filter(entry->entry%2==0).collect(Collectors.toList()).forEach(System.out::println);
	}

}
