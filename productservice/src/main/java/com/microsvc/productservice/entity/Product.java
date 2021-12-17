package com.microsvc.productservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Products")
public class Product {
	
	public Product() {
		super();
	}
	public Product(Long productId, String productName, String manufacturer, String productType) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.manufacturer = manufacturer;
		this.productType = productType;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="PRODUCTID")
	private Long productId;
	
	@Column(name ="PRODUCTNAME")
	private String productName;
	
	@Column(name ="MANUFACTURER")
	private String manufacturer;
	
	@Column(name ="PRODUCTTYPE")
	private String productType;
	
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

}