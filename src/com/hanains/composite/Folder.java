package com.hanains.composite;

import java.util.ArrayList;
import java.util.Iterator;

import com.hanains.composite.Abstract.Component;

public class Folder extends Component {

	private String name;
	private ArrayList<Component> arrFolders = new ArrayList<>();
	
	public Folder(String name) {
		this.name = name;
	}

	
	@Override
	public Component add(Component component) throws Exception {
		// TODO Auto-generated method stub
		arrFolders.add(component);
		return component;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getSize() {
		
		int size = 0;
		Iterator<Component> it = arrFolders.iterator();
		while( it.hasNext() ){
			Component cp = it.next();
			size = size + cp.getSize();
		}
		return size;
	}

	@Override
	public void printList(String strPrefix) {
		
		Iterator<Component> it = arrFolders.iterator();
		while(it.hasNext()){
			Component cp = it.next();
			cp.printList( strPrefix + "/" + name );
		}
		
	}

}
