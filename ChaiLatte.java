package com.beverage;

public class ChaiLatte {
	private boolean tea;
	private boolean sugar;
	private boolean water;
	private boolean milk;
	public  double price=4;
	private boolean isOrderCustomize;
	
	public boolean isTea() {
		return tea;
	}
	public void setTea(boolean tea) {
		this.tea = tea;
	}
	public boolean isSugar() {
		return sugar;
	}
	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}
	public boolean isWater() {
		return water;
	}
	public void setWater(boolean water) {
		this.water = water;
	}
	public boolean isMilk() {
		return milk;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	
	public boolean isOrderCustomize() {
		return isOrderCustomize;
	}
	public void setOrderCustomize(boolean isOrderCustomize) {
		this.isOrderCustomize = isOrderCustomize;
	}
	public  double getPrice() {
		return price;
	}
	public  void setPrice(double price) {
		this.price = price;
	}
	
	
}
