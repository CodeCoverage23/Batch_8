package com.cc.extra;

import com.oops.FinalDemo1;

public class VariableValue extends FinalDemo1 {

	public static void main(String[] args) {
		int i;
		for (i = 0; i < 5; i++) {

		}
		System.out.println(i);

		VariableValue v = new VariableValue();
		v.protectedMethod();
		v.publicMethod();

	}

}
