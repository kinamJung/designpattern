package com.hanains.builder;

import com.hanains.builder.Interface.Builder;

/**
 *  
 * @author bit-user
 * 한개의 문서를 만드는 클래스 (Builder 사용)
 */
public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct(){
		builder.makeTitle("Greeting");
		builder.makeString("아침과 낮에");
		builder.makeItems(new String[] {"안녕하세요.", "안녕히 가세요."});
		builder.close();
	}
	
}
