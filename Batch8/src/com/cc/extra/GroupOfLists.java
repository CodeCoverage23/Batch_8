package com.cc.extra;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroupOfLists {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		for (int i = 1; i <= 111; i++) {
			String s1 = "C";
			String s2 = "C";
			String intAsString = String.valueOf(i);

			list.add(s1 + intAsString + s2);
		}
		System.out.println(list.size());

		int startIndex = 0;
		int limit = 50;

		while (!list.isEmpty()) {
			int toIndex = 0;

			if (list.size() < limit) {
				toIndex = list.size();
			} else {
				toIndex = limit;
			}

			List<String> subList = list.subList(startIndex, toIndex);
			System.out.println(subList);
			System.out.println(subList.size());

			list.removeAll(subList);
		}

		/*
		 * Second way - while (!list.isEmpty()) { List<String> list2 =
		 * list.stream().skip(startIndex).limit(limit).collect(Collectors.toList());
		 * list.removeAll(list2); System.out.println(list2); }
		 */

	}

}
