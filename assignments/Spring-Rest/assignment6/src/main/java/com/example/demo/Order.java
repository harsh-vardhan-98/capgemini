package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {
	
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	@Id
	private String orderName;
	private long price;
	private int Quantity;
	public Order(String orderName, long price, int quantity) {
		super();
		this.orderName = orderName;
		this.price = price;
		Quantity = quantity;
	}
	public Order() {
		super();
		
	}
	

	
	
}
