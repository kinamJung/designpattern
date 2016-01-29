package com.hanains.builder;

import java.io.PrintWriter;

import com.hanains.builder.Interface.Builder;

/**
 * 
 * @author bit-user
 * HTML 파일을 이용해서 문서를 만드는 클래스
 */
public class HTMLBuilder implements Builder {

	private String fileName;
	private PrintWriter writer;
	
	@Override
	public void makeTitle(String title) {
		// TODO Auto-generated method stub
		fileName = title;
	}

	@Override
	public void makeString(String str) {
		// TODO Auto-generated method stub

	}

	@Override
	public void makeItems(String[] items) {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() {
		// TODO Auto-generated method stub

	}

	public String getResult(){
		return fileName;
	}
	
}
