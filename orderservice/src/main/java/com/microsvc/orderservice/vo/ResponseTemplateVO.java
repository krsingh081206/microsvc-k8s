package com.microsvc.orderservice.vo;

import com.microsvc.orderservice.entity.Order;

public class ResponseTemplateVO {
	
	public ResponseTemplateVO() {
		super();
	}
	public ResponseTemplateVO(Product product, Order order) {
		super();
		this.product = product;
		this.order = order;
	}
	private Product product;
	private Order order;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}

}
