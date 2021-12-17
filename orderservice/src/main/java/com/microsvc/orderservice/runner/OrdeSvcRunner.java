package com.microsvc.orderservice.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.microsvc.orderservice.entity.Order;
import com.microsvc.orderservice.service.OrderServiceImpl;

@Component
public class OrdeSvcRunner implements CommandLineRunner{
	

	private static Logger logger = LoggerFactory.getLogger(OrdeSvcRunner.class);
	@Autowired
	private OrderServiceImpl orderSvc;
	


	@Override
	public void run(String... args) throws Exception {
		
		Order order1 = new Order();
		order1.setOrderName("PizzaOrder");
		order1.setOrderType("PrePaid");
		order1.setProductId(1l);
		
        Order resultOrder = orderSvc.commitOrder(order1);
        
		logger.info("Commited Order1 : {}", resultOrder);
		
		Order order2 = new Order();
		order2.setOrderName("BurgerOrder");
		order2.setOrderType("PrePaid");
		order2.setProductId(2l);
		
        Order resultOrder2 = orderSvc.commitOrder(order2);
        				
		logger.info("Commited Order2 : {}", resultOrder2);
		
		// TODO Auto-generated method stub
		
	}

}
