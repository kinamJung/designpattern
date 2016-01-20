package com.hanains.proxy.Interface;

import java.awt.Point;


// Dynamic Proxy를 구성하고자 할때는 추상클래스가 아닌 Interface를 선언한다.
public interface Graphic {
	public  void draw(Point p);
	public  Point getExtent();
}
