package com.loops;

public class DoWhileLoopDemo1 {

	public static void main(String[] args) {

		int i = 1;

		do {
			System.out.println(i);
			i++;
			if (i == 6) {
				break;
			}
		} while (i <= 10);

	}

}
