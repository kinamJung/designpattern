package com.hanains.AbstractFactory;

public class MazeGame {

	public void createMaze(MazeFactory mazeFactory){
		
		Maze maze = mazeFactory.makeMaze();
		Room room = mazeFactory.makeRoom(1);
		Room room2 = mazeFactory.makeRoom(2);
		Door door = mazeFactory.makeDoor(room, room2);
		
		maze.addRoom(room);
		maze.addRoom(room2);
		
		room.setSide(1, mazeFactory.makeWall());
		
		
		
		
	}
	
	
}
