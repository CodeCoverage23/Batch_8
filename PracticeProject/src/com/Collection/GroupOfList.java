package com.Collection;
/*
 * Grouping Of List according to Limit
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class GroupOfList {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		for (int i = 1; i <= 101; i++) {
			l.add(i);

		}
		System.out.println(" List Before Grouping: ");
		System.out.println(l);
		System.out.println("Initial Size of list: " + l.size());
		System.out.println("---------------Grouping of List---------------");

		int startIndex = 0;
		int limit = 50;

		while (!l.isEmpty()) {
			int toIndex = 0;

			if (l.size() < limit) {
				toIndex = l.size();
			} else {
				toIndex = limit;
			}

			List<Integer> subList = l.subList(startIndex, toIndex);
			System.out.println(subList);
			System.out.println("Size of list: " + subList.size());

			l.removeAll(subList);
		}

//   	  Second way 
//		  while (!l.isEmpty()) { 
//			  List<Integer> list2 =
//					  l.stream().skip(startIndex).limit(limit).collect(Collectors.toList());
//		    l.removeAll(list2); 
//		   System.out.println(list2); }
//		 
	}

}
