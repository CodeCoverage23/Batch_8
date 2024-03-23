package com.java.prog;

import java.util.Arrays;
import java.util.List;

public class JavaStream {

	public static void main(String[] args) {

		
		List<String> list=Arrays.asList("this","is","how","reduce()","works");
		
		String reduce = list.stream().reduce("",(prevstring,string)->prevstring+" "+string);
		 System.out.println(reduce);
		
	 List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	 
	 Integer reduce2 = num.stream().reduce(0, (sum,number)->{
		 
		 if(number%2==0){
			 sum=sum+number;
		 }
		return sum; 
	 });
	 System.out.println(reduce2);
	}

}
