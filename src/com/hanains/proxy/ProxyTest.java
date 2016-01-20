package com.hanains.proxy;

import java.lang.reflect.Proxy;

import com.hanains.proxy.Interface.Graphic;



public class ProxyTest {
	

	public static void main(String[] args) {

		
		 System.out.println("----------Proxy----------");
		 ImageProxy imageProxy = new ImageProxy("dolly.jpg"); 
		 Graphic graphic= imageProxy.getImage(); 
		 System.out.println(graphic.getExtent());
		
		 // Dynamic Proxy
		 System.out.println();
		 System.out.println("----------Dynamic Proxy----------");
		 Graphic graphicProxy = (Graphic)Proxy.newProxyInstance(ProxyTest.class.getClassLoader( ), 
				 				new Class[]{Graphic.class},  
				 				new GraphicInvocationHandler(new Image("둘리.jpb"))); // interface로 구성하지 않을 경우 이 부분에서 오류를 반환한다.
		 
		 System.out.println(graphicProxy.getExtent());

	}

}
