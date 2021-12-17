package com.microsvc.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microsvc.productservice.entity.Product;
import com.microsvc.productservice.service.ProductServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class ProductServiceController {
	
	@Autowired
	private ProductServiceImpl productService;
	
	@PostMapping("/products")
	public Product commitProduct(@RequestBody Product product) {
		
		Product commitedProduct = productService.commitProduct(product);
		return commitedProduct;
	}
	
	@GetMapping("/products/{id}")
	public Product commitProduct(@PathVariable Long id) {
		
		Product foundProduct = productService.findById(id);
		return foundProduct;
	}

}
