package com.hanains.proxy;


import java.lang.reflect.*;

import com.hanains.proxy.Abstract.Graphic;


public class GraphicInvocationHandler implements InvocationHandler {

	Graphic graphic;
	
	
	public GraphicInvocationHandler(Graphic graphic) {
		this.graphic = graphic;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		try{
			if(method.getName().startsWith("draw")){
				return method.invoke(graphic, args);
			}else if(method.getName().startsWith("get")){
				return method.invoke(graphic);
			}else if(method.getName().startsWith("Image")){
				return method.invoke(graphic, args);
			}
			
		}catch(InvocationTargetException e){
			e.printStackTrace();
		}
		
		method.invoke(graphic, args);
		return null;
	}
	
}
