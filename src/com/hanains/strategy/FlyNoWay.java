package com.hanains.strategy;

import com.hanains.strategy.Inteface.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I can't Fly!");
	}

}
