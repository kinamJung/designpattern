package com.hanains.prototype;

/**
 * 
 * Abstract class Prototype
 *
 */
public abstract class Prototype implements Cloneable {

	
	/**
	 * 
	 * 복제 메소드
	 * @return Prototype object
	 */
	@Override
	protected Prototype clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Prototype)super.clone();
	}

	/**
	 * 
	 * @param x Position
	 */
	protected abstract void setX(int x);
	protected abstract int getX();
	
}
