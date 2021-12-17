package com.microsvc.orderservice.vo;

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
	private Long productId;
	private String productName;
	private String manufacturer;
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
