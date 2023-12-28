package com.loop;

import java.util.Iterator;

public class BreakAndCountinue {

	public static void main(String[] args) {
		int mul;
		for(int i=1;i<=10;i++) {
			mul=i*5;
			if(mul==15) {
				continue;//skipping particular  iteration
			}
			System.out.println(mul);
			if(mul==25) {
				break;//breaking the loop
			}
		}

	}

}
