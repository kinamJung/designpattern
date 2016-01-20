package com.hanains.proxy;


import java.lang.reflect.*;

import com.hanains.proxy.Interface.Graphic;


// Dynamic Proxy를 구성하고자 할때는 InvecationHandler를 구현한다.
public class GraphicInvocationHandler implements InvocationHandler {

	Graphic graphic;
	
	
	public GraphicInvocationHandler(Graphic graphic) {
		this.graphic = graphic;
	}

	//핵심 기능을 실행하는 역할을 한다.
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
