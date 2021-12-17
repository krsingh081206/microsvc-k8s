package com.microsvc.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microsvc.orderservice.entity.Order;
import com.microsvc.orderservice.service.OrderServiceImpl;
import com.microsvc.orderservice.vo.ResponseTemplateVO;

@RestController
@RequestMapping("/api/v1")
public class OrderController {
	
	@Autowired
	private OrderServiceImpl orderService;
	
	@PostMapping("/orders")
	public Order saveOrder(@RequestBody Order order) {
		
		Order savedOrder = orderService.commitOrder(order);
		return savedOrder;
	}
	
    @GetMapping("/orders/{id}")
	public ResponseTemplateVO findOrderById(@PathVariable("id") Long id) {
    	ResponseTemplateVO foundOrder = orderService.findByOrderId(id);
    	return foundOrder;
    	
    }
}
