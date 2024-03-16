package com.java.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ComparableSort {
	
   public static void main(String[] args) {
	
	   List<Employee1> list=new ArrayList<>();
	   list.add(new Employee1("subhash", 102, 50000.25));
	   list.add(new Employee1("amit", 105, 250000.25));
	   list.add(new Employee1("divya", 101, 80000.25));
	   list.add(new Employee1("naresh", 108, 90000.25));
	   list.add(new Employee1("monika", 104, 65000.25));
//	   List<Employee1> collect = list.stream().filter(s->s.salary>80000.25).collect(Collectors.toList());
//System.out.println(collect);
	         System.out.println(list);
      Predicate<Employee1> p=s->s.salary>80000.25;
      for(Employee1 s:list) {
    	  if(p.test(s)) {
    		  System.out.println(s);
      }
    	  
    	  
      }
//      Collections.sort(list,new IdComparator() );
//      System.out.println(list);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
	   
	   
}
	


