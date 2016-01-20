package com.hanains.composite.Abstract;

import java.io.IOException;

public abstract class Component {
	
	public abstract String getName();
	public abstract int getSize();
	
	public Component add(Component component) throws Exception{
		throw new IOException();
	}
	
	public abstract void printList(String strPrefix);
	
	public void printList(){
		printList("");
	}
	
	public String toString(){
		return getName() + "(" + getSize() + ")";
	}
}
