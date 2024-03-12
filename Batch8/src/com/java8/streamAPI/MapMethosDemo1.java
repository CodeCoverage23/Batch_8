package com.java8.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethosDemo1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("sachin","prati","yashu","Abhishek","kabira","prashik","jiya");
		System.out.println(list);
		
		//convert all strings in uppercase
		List<String> collect = list.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
		
		//convert strings in uppercase if it starts with p character
		
		//traditional way
		List<String> l = new ArrayList<String>();
		for(String s:list) {
			if(s.startsWith("p")) {				//if(s.charAt(0)=='p')
				l.add(s.toUpperCase());
			}
		}
		System.out.println(l);
		
		
		System.out.println("-------------------------------------------------");
		List<String> collect2 = list.stream().filter(s->s.startsWith("p")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect2);
		
		//print which does not starts with p
		System.out.println("--------------------------------------------------");
		list.stream().filter(s->!s.startsWith("p")).map(s->s.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("--------------------------------------------------");
		
		
	}

}
