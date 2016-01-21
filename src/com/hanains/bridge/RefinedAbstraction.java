package com.hanains.bridge;

import com.hanains.bridge.Interface.Abstraction;
import com.hanains.bridge.Interface.Implementor;

public class RefinedAbstraction implements Abstraction {

	private Implementor impl;
	
	// Interface를 매개변수로 받아 실행한다.
	// 즉 확장성이 커진다.
	public RefinedAbstraction(Implementor impl) {
		this.impl = impl;
	}

	@Override
	public void operation() {
		this.impl.operationImpl();
	}

}
