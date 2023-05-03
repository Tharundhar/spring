package com.flipkart;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Products {

	private String productName;
	private int price;
	private int quantity;
	
	private int totalPrice;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Products(String productName, int price, int quantity, int totalPrice) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Products [productName=" + productName + ", price=" + price + ", quantity=" + quantity + "]";
	}
	


}
