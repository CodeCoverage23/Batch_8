package com.java.prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamFlatMap {

	public static void main(String[] args) {

		List<String> productList1 = Arrays.asList("printer", "keyboard", "motherboard","motherboard");
		
		List<String> collect2 = productList1.stream().distinct().collect(Collectors.toList());
		System.out.println(productList1);
		System.out.println();
		System.out.println(collect2);
		System.out.println();
		List<String> productList2 = Arrays.asList("scanner", "projector", "lightPen");
		List<String> productList3 = Arrays.asList("pendrive", "charger", "wifi adapter");
		List<List<String>> allProducts = new ArrayList<>();
		allProducts.add(productList1);
		allProducts.add(productList2);
		allProducts.add(productList3);
		List<String> combinedProduct = new ArrayList<>();
		System.out.println(allProducts);
		System.out.println();
		for (List<String> list : allProducts) {

			for (String product : list) {

				combinedProduct.add(product);

			}

		}
		System.out.println("without usimh flatmap>>");
		System.out.println(combinedProduct);
		System.out.println();

		System.out.println("with flatmap>>");
		
		List<String> collect = allProducts.stream().flatMap(flat->flat.stream()).collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
