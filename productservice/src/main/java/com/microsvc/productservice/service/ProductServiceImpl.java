package com.microsvc.productservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microsvc.productservice.entity.Product;
import com.microsvc.productservice.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl {
	
	@Autowired
	private ProductRepository productRepo;
	
	private static Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
	
	public Product findById(Long id) {
		
		Product  foundProduct = productRepo.findByProductId(id);
		
		logger.info("Found Product Details : {} ",foundProduct);
		return foundProduct;
		
	}
	
     public Product commitProduct(Product product) {
		
		Product  foundProduct = productRepo.save(product);
		
		logger.info("Commited Product Details : {} ",foundProduct);
		return foundProduct;
		
	}
}
