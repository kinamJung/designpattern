package com.hanains.AbstractFactory;

import com.hanains.AbstractFactory.Interface.Mapsite;

public class Room implements Mapsite {

	private Mapsite mapsite[];
	private int roomNumber;
	public Room(){
		mapsite = new Mapsite[4];
	}
	
	public Room(int roomNo) {
		super();
		roomNumber = roomNo;
	}
	
	public Mapsite getSide(int direction){
		return null;
	}
	
	public void setSide(int direction, Mapsite mapsite){
		this.mapsite[direction] = mapsite;
	}
	
	@Override
	public void enter() {
		System.out.println("방 들어옴.");

	}

}
