package com.hanains.AbstractFactory;

import com.hanains.AbstractFactory.Interface.MazeFactory;

public class EnchantedMazeFactory implements MazeFactory {

	@Override
	public Maze makeMaze() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Wall makeWall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room makeRoom(int no) {
		// TODO Auto-generated method stub
		return new Room(no);
	}

	@Override
	public Door makeDoor(Room room, Room room2) {
		// TODO Auto-generated method stub
		return new Door(room, room2);
	}


}
