package com.hanains.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UppercaseHandler implements InvocationHandler {
	Hello m_clsTarget;

	public UppercaseHandler(Hello clsTarget) {
		m_clsTarget = clsTarget;
	}

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		String strRet = (String) arg1.invoke(m_clsTarget, arg2);
		return strRet.toUpperCase();
	}

}