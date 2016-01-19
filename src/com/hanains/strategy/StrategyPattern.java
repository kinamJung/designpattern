package com.hanains.strategy;

public class StrategyPattern {

	public static void main(String[] args) {
	
		// Make Strategy
		FlyWithWings flyWithWings = new FlyWithWings();
		FlyNoWay flyNoWay = new FlyNoWay();
		
		// Inject Strategy
		Duck loverDuck = new LoverDuck(flyNoWay);
		
		//perform
		loverDuck.performFly();
		
		//Set Strategy
		loverDuck.setFlyBehavior(flyWithWings);
		
		//perform
		loverDuck.performFly();
	}
}
