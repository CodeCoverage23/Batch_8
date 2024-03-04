package com.java.assignment20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Design the method which return the list that contain the element as Ram, Sohan, Ashok, Ajay, Prasanna now I want to
//		sort that element based on descending order.
public class SortList {

	public List<String> getListElements(){
		
		List<String> list=new ArrayList<>();
		list.add("Ram");
		list.add("Ashok");
		list.add("Ajay");
		list.add("Prasanna");		
		return list;
	}
		
		
		
	public static void main(String[] args) {

		SortList sort=new SortList();

		List<String> listElements = sort.getListElements();
		
		Collections.sort(listElements);
		
		System.out.println("list of elements in ascending order"+listElements);
		
		for(int i=listElements.size()-1;i>=0;i--) {
			
			System.out.println(listElements.get(i));
		}
		
		
		
	}

}
