package com.microsvc.productservice.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.microsvc.productservice.entity.Product;
import com.microsvc.productservice.repository.ProductRepository;
import com.microsvc.productservice.service.ProductServiceImpl;

@Component
public class ProductDemoRunner implements CommandLineRunner {
	
	@Autowired
	private ProductServiceImpl productService;
	
	private static Logger logger = LoggerFactory.getLogger(ProductDemoRunner.class);

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Product product1 = new Product();
		
		product1.setManufacturer("PizzaHut");
		product1.setProductName("Cheese Pizza");
		product1.setProductType("TakeAway");
		
		Product commitedProduct = productService.commitProduct(product1);
		
		
		logger.info("CommandLineRunner Product1 Details : {} ", commitedProduct);
		
Product product2 = new Product();
		
		product2.setManufacturer("MCDonalds");
		product2.setProductName("Aloo Tikki");
		product2.setProductType("DineIn");
		
		Product commitedProduct2 = productService.commitProduct(product2);
		logger.info("CommandLineRunner Product2 Details : {} ", commitedProduct2);
	}
	
	

}
