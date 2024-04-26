package com.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productservice.repository.entity.ProductEntity;

@Repository
public interface ProductRepositiory extends JpaRepository<ProductEntity, Integer> {

}
