package com.hanains.proxy;

import java.awt.Point;

import com.hanains.proxy.Interface.Graphic;

public class ImageProxy implements Graphic {

	private Image image;
	private Point p;
	private String fileName;
	
	public ImageProxy(String fileName){
		this.fileName = fileName;
		p = new Point();
		p.setLocation(0, 0);
		image = null;
	}
	
	protected Image getImage(){
		
		if(image == null){
			image = new Image(fileName);
		}
		return image;
	}
	
	// 핵심기능을 실행한다.
	@Override
	public void draw(Point p) {
		// TODO Auto-generated method stub
		image.draw(p);
	}

	@Override
	public Point getExtent() {
		// TODO Auto-generated method stub
		
		if( p.getX() == 0 && p.getY() == 0 ){
			p = image.getExtent();
		}
		return p;
	}

}
