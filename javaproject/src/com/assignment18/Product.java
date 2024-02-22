package com.assignment18;

public class Product {

	public void productCheck(int weight) {


		if (weight < 100) {

			throw new ProductException("invalid weight , weight must be above 100");

		}
		else {

			System.out.println(" sastisfied weight ");
		}
	}

}
