package com.hanains.builder.Interface;


/**
 * 
 * @author ki-nam Jung
 * @since 2016.01.28
 * @version 1.0
 * 문서를 구성하기 위한 메소드를 결정하는 인터페이스(Builder)
 */
public interface Builder {
	void makeTitle(String title);
	void makeString(String str);
	void makeItems(String[] items);
	void close();
	
}
