package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(100);
		t.add(12);
		t.add(3);
		t.add(29);
		t.add(42);
		t.add(1);
		System.out.println(t);
		
		List<Integer> list = new ArrayList<>(t);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(4);
		list.add(3);
		list.add(34);
		list.add(44);
		list.add(33);
		list.add(100);
		TreeSet<Integer> ts=new TreeSet<>(list);
		System.out.println(ts);
		
		
		ArrayList<Integer> evenNumberList = new ArrayList<Integer>();
		ArrayList<Integer> oddNumberList = new ArrayList<Integer>();
		
		//by iterator
		
//		Iterator<Integer> itr=ts.iterator();
//		while(itr.hasNext()) {
//			Integer data = itr.next();
//			if(data%2==0) {
//				evenNumberList.add(data);
//			}
//		}
//		System.out.println(evenNumberList);
//		
		
		//by for each loop
		for(Integer i : ts) {
			if(i%2==0) {
				evenNumberList.add(i);
			}else {
				oddNumberList.add(i);
			}
		}
		System.out.println(evenNumberList);
		System.out.println(oddNumberList);

	}

}
