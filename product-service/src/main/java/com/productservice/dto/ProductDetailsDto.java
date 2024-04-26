package com.productservice.dto;

import lombok.Data;

@Data
public class ProductDetailsDto {

	private int id;
	private String productName;
	private double productPrice;
	private String productCategory;
	private String productCode;

}
