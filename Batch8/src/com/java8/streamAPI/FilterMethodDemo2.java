package com.java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethodDemo2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("sachin","ram","yash","Abhi","kabir","shri","jiya");
		
		
		//to find length : 
		
		//traditional way
		
		for(String s : list) {
			int length=s.length();
			if(length>3)
			System.out.println(length);
		}
		
		//by using filter method
		List<String> collect = list.stream().filter(e->e.length()>3).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println("*******************************************");
		
		list.stream().filter(e->e.length()>3).collect(Collectors.toList()).forEach(e->System.out.println(e));
		System.out.println("*********************************************");
		list.stream().filter(e->e.length()>3).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("*********************");
		System.out.println();
		List<String> languages = Arrays.asList(null,"java","python",null,"c",".Net");
		languages.stream().filter(e->e!=null).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println();
		System.out.println("**************************************");
		languages.stream().filter(e->e!=null&&e.length()>3).collect(Collectors.toList()).forEach(System.out::println);
	}

}
