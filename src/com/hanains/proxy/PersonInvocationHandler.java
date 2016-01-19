package com.hanains.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PersonInvocationHandler implements InvocationHandler{

	Person person;
	
	public PersonInvocationHandler(Person person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		String ret = null;
		try {
			ret = (String)method.invoke(person, args);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ret.toUpperCase( );
		
	}

}
