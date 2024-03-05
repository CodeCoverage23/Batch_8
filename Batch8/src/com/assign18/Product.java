package com.assign18;

public class Product {
	public void productCheck(int weight) {
		if(weight<100) {
			throw new ProductException("invalid weight,weight must be more than 100");
		}

	}

}
