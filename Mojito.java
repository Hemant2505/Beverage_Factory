package com.beverage;

public class Mojito {
	private boolean lemon;
	private boolean sugar;
	private boolean water;
	private boolean soda;
	private boolean mint;
	public  double price=7.5;
	private boolean isOrderCustomize;
	public boolean isLemon() {
		return lemon;
	}
	public void setLemon(boolean lemon) {
		this.lemon = lemon;
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
	public boolean isSoda() {
		return soda;
	}
	public void setSoda(boolean soda) {
		this.soda = soda;
	}
	public boolean isMint() {
		return mint;
	}
	public void setMint(boolean mint) {
		this.mint = mint;
	}

	public boolean isOrderCustomize() {
		return isOrderCustomize;
	}
	public void setOrderCustomize(boolean isOrderCustomize) {
		this.isOrderCustomize = isOrderCustomize;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
