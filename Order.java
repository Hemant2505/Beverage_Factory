package com.beverage;

public class Order {
	private String itemName;
	private double price;
	private double actualPrice;

	public Order(String itemName, double price, double actualPrice) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.actualPrice = actualPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}

	public double getActualPrice() {
		return actualPrice;
	}

}
