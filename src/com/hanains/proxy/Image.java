package com.hanains.proxy;

import java.awt.Point;

import com.hanains.proxy.Abstract.Graphic;

public class Image implements Graphic {

	
	public Image(String str) {
		System.out.println("이미지 : " + str + " 로드.");
	}
	
	@Override
	public void draw(Point p) {
		// TODO Auto-generated method stub
			System.out.println("X:" + p.getX() + " Y:" + p.getY()+" 지점에 그림.");
	}

	@Override
	public Point getExtent() {
		// TODO Auto-generated method stub
		System.out.println("이미지 포인터 반환");
		Point p = new Point(1, 2);
		return p;
	}

}
