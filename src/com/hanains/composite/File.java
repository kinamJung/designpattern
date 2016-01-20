package com.hanains.composite;

import com.hanains.composite.Abstract.Component;

public class File extends Component {

	private String name;
	private int size;
	
	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public void printList(String strPrefix) {
		System.out.println("Composite Pattern" + strPrefix + "/" +this);
	}
	
	
}
