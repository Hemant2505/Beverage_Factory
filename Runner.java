package com.beverage;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Runner {
	public static void main(String[] args) {
		
		
		if (args.length > 0) {
			OrderManager manager = new OrderManager();
			for (int i = 0; i < args.length; i++) {
				String order = args[i];
				if (order.contains(", -")) {
					String[] array = order.split(", -");
					List<String> ingredients = new ArrayList<>();
					for (int j = 1; j < array.length; j++) {
						if (array[j] != null && array[j].trim().length() > 0)
							ingredients.add(array[j]);
					}
					manager.customizeOrder(array[0], ingredients.stream().toArray(String[]::new));
				} else {
					manager.regularOrder(order);
				}
			}
			manager.billing();

		} else {
			System.out.println("Sorry !!!");
			System.out.println("Order should should not be empty!!");
		}

	}
}
