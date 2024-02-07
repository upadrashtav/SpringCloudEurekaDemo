package com.example.springcloudeurekademo;

public class Product {
	private String name;
	private Integer price;
	
	public Product(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public Product() {
		super();
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
}
