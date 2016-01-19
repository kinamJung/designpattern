package com.hanains.AbstractFactory.Interface;

import com.hanains.AbstractFactory.Door;
import com.hanains.AbstractFactory.Maze;
import com.hanains.AbstractFactory.Room;
import com.hanains.AbstractFactory.Wall;

public interface MazeFactory {

	Maze makeMaze();
	Wall makeWall();
	Room makeRoom(int no);
	Door makeDoor(Room room, Room room2);
	
}
