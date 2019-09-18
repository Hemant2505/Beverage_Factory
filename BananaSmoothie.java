package com.beverage;

public class BananaSmoothie {
	private boolean banana;
	private boolean sugar;
	private boolean water;
	private boolean milk;
	public  double price=6;
	 
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private boolean isOrderCustomize;
	public boolean isBanana() {
		return banana;
	}
	public void setBanana(boolean banana) {
		this.banana = banana;
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
	
	
	
}
