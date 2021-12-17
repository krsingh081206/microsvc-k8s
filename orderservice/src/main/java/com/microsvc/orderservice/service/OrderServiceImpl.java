package com.microsvc.orderservice.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.microsvc.orderservice.entity.Order;
import com.microsvc.orderservice.repo.OrderRepository;
import com.microsvc.orderservice.vo.Product;
import com.microsvc.orderservice.vo.ResponseTemplateVO;

@Service
@Transactional
public class OrderServiceImpl {
	
	private static Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private OrderRepository orderRepo;
	
	public Order commitOrder(Order order) {
		
		Order orderNew = orderRepo.save(order);
		
		return orderNew;
		
	}
	
	public ResponseTemplateVO findByOrderId(Long orderId) {
		
		ResponseTemplateVO rvo = new ResponseTemplateVO();
		Order resultOrder = orderRepo.findByOrderId(orderId);
		
		
		
			logger.info("Resultant Order : {} ", resultOrder);
		
		Product product = restTemplate.getForObject("http://PRODUCT-SERVICE/api/v1/products/"+resultOrder.getProductId(),Product.class);
		
		rvo.setOrder(resultOrder);
		rvo.setProduct(product);
		
		logger.info("Resultant ResponsVO : {} ", rvo);
		
		
		return rvo;
	}

}
