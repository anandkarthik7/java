package com.model;

public class Clothing extends Product {
	private int productId;
	private String size;
	private String color;
	public Clothing(String productName, String description, double price, int quantityInStock, String type,
			int productId, String size, String color) {
		super(productName, description, price, quantityInStock, type);
		this.productId = productId;
		this.size = size;
		this.color = color;
	}
	public Clothing() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Clothing(int productId, String productName, String description, double price, int quantityInStock,
			String type) {
		super(productId, productName, description, price, quantityInStock, type);
		// TODO Auto-generated constructor stub
	}
	public Clothing(String productName, String description, double price, int quantityInStock, String type) {
		super(productName, description, price, quantityInStock, type);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Clothing [productId=" + productId + ", size=" + size + ", color=" + color + "]";
	}
	public int getProductId() {
		return productId;
	}
	public String getSize() {
		return size;
	}
	public String getColor() {
		return color;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
