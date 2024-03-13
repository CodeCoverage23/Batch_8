package com.task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroupOfList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		
		for(int i=1;i<=101;i++){
//			String str1="jiyaa";
//			String str2="piyaa";
			String intAsString = String.valueOf(i);
//			list.add(str1 + intAsString+str2);
			
			
			list.add("c" + intAsString+"c");
			
		}
		System.out.println(list.size());
		
		int startIndex=0;
		int limit = 50;
		
//		while(!list.isEmpty()) {
//			int toIndex=0;
//			if(list.size()<limit) {
//				toIndex=list.size();
//			}else {
//				toIndex=limit;
//			}
//			
//			List<String> subList = list.subList( startIndex,toIndex);
//			System.out.println(subList);
//			list.removeAll(subList);
//		}
		
		while(!list.isEmpty()) {
		List<String> list2= list.stream().skip(startIndex).limit(limit).collect(Collectors.toList());
		list.removeAll(list2);
		System.out.println(list2);
		}
	}

}
