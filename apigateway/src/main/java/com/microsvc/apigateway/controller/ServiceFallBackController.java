package com.microsvc.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ServiceFallBackController {
	
	@GetMapping("/orderfallback")
	public String fallbackOrderSvc() {
		return "Order Service Not Available, please try later";
	}
	
	
	@GetMapping("/productfallback")
	public String fallbackProductSvc() {
		return "Product Service Not Avaialable, please try later";
	}

}
