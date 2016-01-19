package com.hanains.strategy;

import com.hanains.strategy.Inteface.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm Flying!");
	}

}
