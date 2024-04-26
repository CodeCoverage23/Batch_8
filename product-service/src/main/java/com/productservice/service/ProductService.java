package com.productservice.service;

import java.util.List;

import com.productservice.dto.ProductDetailsDto;

public interface ProductService {

	/**
	 * It will save the product details Dto in DB
	 * 
	 * @param detailsDto The Dto
	 * @return The response
	 */
	String createProduct(ProductDetailsDto detailsDto);

	/**
	 * It will return the list of product entity
	 * 
	 * @return The list of {@link ProductDetailsDto}
	 */
	List<ProductDetailsDto> getAllProducts();

	/**
	 * Get product by product id
	 * 
	 * @param id The product id
	 * @return The response DTO {@link ProductDetailsDto}
	 */
	ProductDetailsDto getProductById(int id);

	/**
	 * It will update product into DB
	 * 
	 * @param id         The Product id
	 * @param detailsDto The Product DTO
	 * @return The response DTO {@link ProductDetailsDto}
	 */
	ProductDetailsDto updateProduct(int id, ProductDetailsDto detailsDto);

	/**
	 * It will delete the product in DB
	 * 
	 * @param id The product ID
	 */
	void deleteProduct(int id);

}
