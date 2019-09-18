package com.beverage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager {
	
	private List<Order> orderList = new ArrayList<>();
	
	Map<String,Double> ingredientsPrice=new HashMap<>();	
	/*
	public static final double SUGAR_PRICE = 0.5;
	public static final double WATER_PRICE = 0.5;
	public static final double MILK_PRICE = 1;
	public static final double SODA_PRICE = 0.5;
	public static final double MINT_PRICE = 0.5;

	public static final String SUGAR = "sugar";
	public static final String WATER = "water";
	public static final String MILK = "milk";
	public static final String SODA = "soda";
	public static final String MINT = "mint";
	*/
	public void regularOrder(String itemName) {
	
		
		switch (itemName) {
		case Menu.BANANA_SMOOTHIE:
			BananaSmoothie bananaSmoothie = new BananaSmoothie();
			orderList.add(new Order(itemName, bananaSmoothie.getPrice(), bananaSmoothie.getPrice()));
			break;
		case Menu.CHAI_LATTE:
			ChaiLatte chaiLatte = new ChaiLatte();
			orderList.add(new Order(itemName, chaiLatte.getPrice(), chaiLatte.getPrice()));
			break;
		case Menu.COFFEE_LATTE:
			CoffeeLatte coffeeLatte = new CoffeeLatte();
			orderList.add(new Order(itemName, coffeeLatte.getPrice(), coffeeLatte.getPrice()));
			break;
		case Menu.MOJITO:
			Mojito mojito = new Mojito();
			orderList.add(new Order(itemName, mojito.getPrice(), mojito.getPrice()));
			break;
		case Menu.STRAWBERRY_SHAKE:
			StrawberryShake strawberryShake = new StrawberryShake();
			orderList.add(new Order(itemName, strawberryShake.getPrice(), strawberryShake.getPrice()));
			break;

		default:
			break;
		}
	}

	public void customizeOrder(String itemName,String []ingredients) {
		
		double ingredientsPrice = 0;
		switch (itemName) {
		case Menu.BANANA_SMOOTHIE:
			BananaSmoothie bananaSmoothie = new BananaSmoothie();
			for (int i = 0; i < ingredients.length; i++) {
				ingredientsPrice += getIngredientsPrice(ingredients[i]);
			}
			orderList.add(new Order(itemName, bananaSmoothie.getPrice() - ingredientsPrice, bananaSmoothie.getPrice()));
			break;
		case Menu.CHAI_LATTE:
			ChaiLatte chaiLatte = new ChaiLatte();
			for (int i = 0; i < ingredients.length; i++) {
				ingredientsPrice += getIngredientsPrice(ingredients[i]);
			}
			orderList.add(new Order(itemName, chaiLatte.getPrice() - ingredientsPrice, chaiLatte.getPrice()));
			break;
		case Menu.COFFEE_LATTE:
			CoffeeLatte coffeeLatte = new CoffeeLatte();
			for (int i = 0; i < ingredients.length; i++) {
				ingredientsPrice += getIngredientsPrice(ingredients[i]);
			}
			orderList.add(new Order(itemName, coffeeLatte.getPrice() - ingredientsPrice, coffeeLatte.getPrice()));
			break;
		case Menu.MOJITO:
			Mojito mojito = new Mojito();
			for (int i = 0; i < ingredients.length; i++) {
				ingredientsPrice += getIngredientsPrice(ingredients[i]);
			}
			orderList.add(new Order(itemName, mojito.getPrice() - ingredientsPrice, mojito.getPrice()));
			break;
		case Menu.STRAWBERRY_SHAKE:
			StrawberryShake strawberryShake = new StrawberryShake();
			for (int i = 0; i < ingredients.length; i++) {
				ingredientsPrice += getIngredientsPrice(ingredients[i]);
			}
			orderList.add(
					new Order(itemName, strawberryShake.getPrice() - ingredientsPrice, strawberryShake.getPrice()));
			break;

		default:
			break;
		}
	}

	private double getIngredientsPrice(String ingredient) {
		
		ingredientsPrice.put("sugar", 0.5d);
		ingredientsPrice.put("milk", 1.d);
		ingredientsPrice.put("water", 0.5d);
		ingredientsPrice.put("soda", 0.5d);
		ingredientsPrice.put("mint", 0.5d);
		
		switch (ingredient) {
		case "sugar" :
			return ingredientsPrice.get("sugar");
		case "water":
			return ingredientsPrice.get("water");
		case "milk":
			return ingredientsPrice.get("milk");
		case "soda":
			return ingredientsPrice.get("soda");
		case "mint":
			return ingredientsPrice.get("mint");
		default:
			return 0;
		}

	}

	public void billing() {
		double totalPrice = 0;
		double totalActualPrice = 0;
		System.out.println("=========================================");
		System.out.println("Item name \t Price \t Actual price");
		System.out.println("=========================================");
		for (Order order : orderList) {
			totalPrice += order.getPrice();
			totalActualPrice += order.getActualPrice();
			System.out.println(order.getItemName() + " \t " + order.getPrice() + " \t " + order.getActualPrice());

		}

		System.out.println("=========================================");
		System.out.println("Total price: " + totalPrice);
		System.out.println("Total actual price: " + totalActualPrice);

	}

}
