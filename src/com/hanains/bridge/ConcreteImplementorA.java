package com.hanains.bridge;

import com.hanains.bridge.Interface.Implementor;

public class ConcreteImplementorA implements Implementor {

	@Override
	public void operationImpl() {
		System.out.println("ConcreteImplementorA");
	}

}
