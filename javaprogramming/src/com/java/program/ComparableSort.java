package com.java.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSort {
	
   public static void main(String[] args) {
	
	   List<Employee1> list=new ArrayList<>();
	   list.add(new Employee1("subhash", 102, 50000.25));
	   list.add(new Employee1("amit", 105, 250000.25));
	   list.add(new Employee1("divya", 101, 80000.25));
	   list.add(new Employee1("naresh", 108, 90000.25));
	   list.add(new Employee1("monika", 104, 65000.25));

      System.out.println(list);
      
      Collections.sort(list,new IdComparator() );
      System.out.println(list);
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
	

}
