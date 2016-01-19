package com.hanains.AbstractFactory;

import com.hanains.AbstractFactory.Interface.Mapsite;

public class Door implements Mapsite {

	private Room room1;
	private Room room2;
	private boolean isOpen;
	
	
	public Door() {
		room1 = null;
		room2 = null;
	}
	public Door(Room room1 , Room room2) {
		super();
		this.room1 = room1;
		this.room2 = room2;
	}

	@Override
	public void enter() {
		System.out.println("이것은 문이다.");
	}
}
