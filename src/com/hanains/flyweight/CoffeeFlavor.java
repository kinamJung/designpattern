package com.hanains.flyweight;

import com.hanains.flyweight.Interface.CoffeeOrder;

public class CoffeeFlavor implements CoffeeOrder {

	private String flavor;
	
	public String getFlavor() {
		return flavor;
	}

	public CoffeeFlavor(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public void serveCoffee(CoffeeOrderContext context) {
	
		System.out.println("Serving Coffee flavor " + flavor + " to table number " + context.getTableNumber() );
	}

}
