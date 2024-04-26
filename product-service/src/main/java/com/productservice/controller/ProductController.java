package com.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productservice.dto.ProductDetailsDto;
import com.productservice.service.ProductService;

@RestController
public class ProductController {

	private final static String PRODUCT_DELETED = "Product is Delted";

	@Autowired
	private ProductService productService;

	@PostMapping("/addProduct")
	public ResponseEntity<String> createProduct(@RequestBody ProductDetailsDto detailsDto) {
		String string = productService.createProduct(detailsDto);
		return new ResponseEntity<String>(string, HttpStatus.CREATED);
	}

	@GetMapping("/products")
	public List<ProductDetailsDto> getAllProducts() {
		return productService.getAllProducts();
	}

	@GetMapping("/product/{id}")
	public ResponseEntity<ProductDetailsDto> getProductById(@PathVariable int id) {
		ProductDetailsDto dto = productService.getProductById(id);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}

	@PutMapping("/product/{id}")
	public ResponseEntity<ProductDetailsDto> updateProduct(@PathVariable int id,
			@RequestBody ProductDetailsDto detailsDto) {
		ProductDetailsDto dto = productService.updateProduct(id, detailsDto);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}

	@DeleteMapping("/product/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable int id) {
		productService.deleteProduct(id);
		return ResponseEntity.accepted().body(PRODUCT_DELETED);
	}
}
