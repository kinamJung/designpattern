package com.hanains.chaing_of_responsibility;

/**
 * @author bit-user
 *
 */
public class Trouble {

	private int number;

	public Trouble(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Trouble [number=" + number + "]";
	}
	
	
}