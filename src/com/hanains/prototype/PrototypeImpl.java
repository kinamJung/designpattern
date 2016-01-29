package com.hanains.prototype;

public class PrototypeImpl extends Prototype {

	private int x;
	
	
	public PrototypeImpl(int x) {
		this.x = x;
	}

	@Override
	protected void setX(int x) {
		// TODO Auto-generated method stub
		this.x = x;
	}

	@Override
	protected int getX() {
		// TODO Auto-generated method stub
		return x;
	}

}
