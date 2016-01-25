package com.hanains.flyweight;

public class FlyweightTest {

	// The flavors ordered
	private static CoffeeFlavor[] flavors = new CoffeeFlavor[100];
	
	// The tables for the orders
	private static CoffeeOrderContext[] tables = new CoffeeOrderContext[100];
	private static int orderMade = 0;
	private static CoffeeFlavorFactory flavorFactory;
	
	public static void main(String[] args) {
		
		flavorFactory = new CoffeeFlavorFactory();
		takeOrders("Cappucino", 2);
		takeOrders("Cappucino", 2);
		takeOrders("Frappe", 1);
		takeOrders("Frappe", 1);
		takeOrders("Cappucino", 97);
	    takeOrders("Frappe", 3);
	    takeOrders("Xpresso", 3);
	    takeOrders("Cappucino", 3);
		
	    for(int i = 0; i < orderMade; i++){
	    	flavors[i].serveCoffee(tables[i]);
	    }
	    
	    System.out.println(" ");
		System.out.println("total CoffeeFlavor object made: " + flavorFactory.getTotalCoffeeFlavorsMade());
	}
	
	
	public static void takeOrders(String flavorIn, int table){
		flavors[orderMade] = flavorFactory.getCoffeeFlavor(flavorIn);
		tables[orderMade++] = new CoffeeOrderContext(table);
	}
	
}
