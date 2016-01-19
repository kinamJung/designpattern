package com.hanains.strategy;

import com.hanains.strategy.Inteface.FlyBehavior;

public class LoverDuck extends Duck {

	public LoverDuck(FlyBehavior flyBehavior){
		super.flyBehavior = flyBehavior;
	}

	@Override
	void display() {
		System.out.println("I'm lover Duck!");
	}
	
	
}
