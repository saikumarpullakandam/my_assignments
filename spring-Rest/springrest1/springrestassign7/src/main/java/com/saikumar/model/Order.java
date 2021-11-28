package com.saikumar.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document(collection="Order")
public class Order {
	@Id
	private int id;
	@Field
	private String orderName;
	@Field
	private String orderDate;
	@Field
	private int orderAmount;
	@Field
	private int orderDiscount;
	public Order(String orderName, String orderDate, int orderAmount, int orderDiscount, int id) {
		super();
		this.id = id;
		this.orderName = orderName;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.orderDiscount = orderDiscount;
	}
	public int getId() {
		return id;
	}
	public String getOrderName() {
		return orderName;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public int getOrderDiscount() {
		return orderDiscount;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderName=" + orderName + ", orderDate=" + orderDate + ", orderAmount="
				+ orderAmount + ", orderDiscount=" + orderDiscount + "]";
	}
	
	
	


}



