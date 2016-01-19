package com.hanains.proxy;

import java.lang.reflect.Proxy;

import com.hanains.proxy.Abstract.Graphic;



public class ProxyTest {
	

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		 ImageProxy imageProxy = new ImageProxy("dolly.jpg"); 
		 Graphic graphic= imageProxy.getImage(); 
		 System.out.println(graphic.getExtent());
		 
		
		 Graphic graphicProxy = (Graphic)Proxy.newProxyInstance(ProxyTest.class.getClassLoader( ), 
				 				new Class[]{Graphic.class},
				 				new GraphicInvocationHandler(new Image("str")));
		 
		 System.out.println(graphicProxy.getExtent());


		/*Hello proxyHello = (Hello)Proxy.newProxyInstance( ProxyTest.class.getClassLoader( )
				   , new Class[]{ Hello.class }
				   , new UppercaseHandler(new HelloTarget()) );
				  
		System.out.println( proxyHello.sayHello( "Jain" ) );*/
	}

	public static Graphic getGraphicProxy(Image graphic) {
		return (Graphic) Proxy.newProxyInstance(ProxyTest.class.getClassLoader( ), new Class[]{Graphic.class},
				new GraphicInvocationHandler(graphic));
	}

}
