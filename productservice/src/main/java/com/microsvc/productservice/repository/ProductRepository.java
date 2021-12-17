package com.microsvc.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microsvc.productservice.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
	
	Product findByProductId(Long productId);

}
