package com.productservice.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productservice.dto.ProductDetailsDto;
import com.productservice.repository.ProductRepositiory;
import com.productservice.repository.entity.ProductEntity;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService {

	private final static String SUCCESSFULLY_SAVED = "Succesfully Saved";

	@Autowired
	private ProductRepositiory productRepositiory;

	@Override
	public String createProduct(ProductDetailsDto detailsDto) {
		log.info("createProduct method start Product Details Dto : {}", detailsDto);

		ProductEntity productEntity = ProductEntity.builder().productName(detailsDto.getProductName())
				.productCategory(detailsDto.getProductCategory()).productPrice(detailsDto.getProductPrice())
				.productCode(detailsDto.getProductCode()).build();

		productRepositiory.save(productEntity);
		log.info("createProduct method end");
		return SUCCESSFULLY_SAVED;
	}

	@Override
	public List<ProductDetailsDto> getAllProducts() {

		log.info("getAllProduct Method Start");
		// get products from DB
		List<ProductEntity> entities = productRepositiory.findAll();

		// by lambda expression
		List<ProductDetailsDto> list = entities.stream().map(entry -> convertProductEntityToDetailsDto(entry))
				.collect(Collectors.toList());

		/*
		 * by method reference
		 */
		// List<ProductDetailsDto> list =
		// entities.stream().map(this::convertProductEntityToDetailsDto)
		// .collect(Collectors.toList());

		log.info("getAllProduct Method End");
		return list;
	}

	private ProductDetailsDto convertProductEntityToDetailsDto(ProductEntity entity) {
		log.info("CALLED");
		ProductDetailsDto dto = new ProductDetailsDto();
		dto.setId(entity.getId());
		dto.setProductName(entity.getProductName());
		dto.setProductCategory(entity.getProductCategory());
		dto.setProductCode(entity.getProductCode());
		dto.setProductPrice(entity.getProductPrice());
		return dto;
	}

	@Override
	public ProductDetailsDto getProductById(int id) {
		log.info("STARTED");

		Optional<ProductEntity> productEntity = productRepositiory.findById(id);

		ProductEntity entity = productEntity.orElse(null);

		ProductDetailsDto detailsDto = new ProductDetailsDto();
		if (entity != null) {
			detailsDto = convertProductEntityToDetailsDto(entity);
		}
		log.info("ENDED");
		return detailsDto;
	}

	@Override
	public ProductDetailsDto updateProduct(int id, ProductDetailsDto detailsDto) {
		log.info("updateProduct STARTED");

		// Step 1 : Fetch product by give product id

		ProductEntity productEntity = productRepositiory.findById(id).orElseThrow();

		// Step 2 : set all fields from details DTO

		productEntity.setProductName(detailsDto.getProductName());
		productEntity.setProductCode(detailsDto.getProductCode());
		productEntity.setProductPrice(detailsDto.getProductPrice());
		productEntity.setProductCategory(detailsDto.getProductCategory());

		// step 3 : Update it

		ProductEntity entity = productRepositiory.save(productEntity);

		// Step 4 : convert entity to DTO
		log.info("updateProduct ENDED");
		return convertProductEntityToDetailsDto(entity);
	}

	@Override
	public void deleteProduct(int id) {
		log.info("deleteProduct STARTED");
		productRepositiory.deleteById(id);
		log.info("deleteProduct STARTED");
	}

}