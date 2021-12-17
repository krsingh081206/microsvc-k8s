package com.microsvc.orderservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDERS")
public class Order {
	


	public Order() {
		super();
	}
	public Order(String orderName, String orderType, Long productId) {
		super();
		this.orderName = orderName;
		this.orderType = orderType;
		this.productId = productId;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ORDERID")
	private Long orderId;
	
	@Column(name = "ORDERNAME")
	private String orderName;
	
	@Column(name = "ORDERTYPE")
	private String orderType;
	
	@Column(name = "PRODUCTID")
	
	private Long productId;
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getOrderId() {
		return orderId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [orderId=");
		builder.append(orderId);
		builder.append(", orderName=");
		builder.append(orderName);
		builder.append(", orderType=");
		builder.append(orderType);
		builder.append(", productId=");
		builder.append(productId);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
