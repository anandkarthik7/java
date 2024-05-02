package com.model;

public class Electronics extends Product {
	
	private int productId;
	private String brand;
	private int warrantyPeriod;
	public Electronics(String productName, String description, double price, int quantityInStock, String type,
			int productId, String brand, int warrantyPeriod) {
		super(productName, description, price, quantityInStock, type);
		this.productId = productId;
		this.brand = brand;
		this.warrantyPeriod = warrantyPeriod;
	}
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Electronics(int productId, String productName, String description, double price, int quantityInStock,
			String type) {
		super(productId, productName, description, price, quantityInStock, type);
		// TODO Auto-generated constructor stub
	}
	public Electronics(String productName, String description, double price, int quantityInStock, String type) {
		super(productName, description, price, quantityInStock, type);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Electronics [productId=" + productId + ", brand=" + brand + ", warrantyPeriod=" + warrantyPeriod + "]";
	}
	public int getProductId() {
		return productId;
	}
	public String getBrand() {
		return brand;
	}
	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}
	
	
}