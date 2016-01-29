package com.hanains.builder;

import com.hanains.builder.Interface.Builder;

public class TextBuilder implements Builder {

	private StringBuffer buffer = new StringBuffer();
	@Override
	public void makeTitle(String title) {
		// TODO Auto-generated method stub
		buffer.append(title);
	}

	@Override
	public void makeString(String str) {
		// TODO Auto-generated method stub
		buffer.append(str);
	}

	@Override
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub
		buffer.append(items);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}
	public String getResult(){
		return buffer.toString();
	}
}
