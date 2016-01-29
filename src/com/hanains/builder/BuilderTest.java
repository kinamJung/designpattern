package com.hanains.builder;

/**
 * 
 *			Builder Pattern
 * 
 * 
 * 								@author Kinam Jung
 * 								@since 2016.01.26
 *
 */
public class BuilderTest {
	public static void main(String[] args) {
		
		TextBuilder textBuilder = new TextBuilder();  // Text를 만드는 빌더
		Director director = new Director(textBuilder);  // 디렉터에 빌더 추가
		director.construct();                         // 디렉터가 빌더를 통해 product 만든다.
		String result = textBuilder.getResult();       // 빌더가 만든 product를 받는다.
		
		HTMLBuilder htmlBuilder = new HTMLBuilder();
		Director director2 = new Director(htmlBuilder);
		director2.construct();
		String fileName = htmlBuilder.getResult();
		
		System.out.println("---TextBuilder ---");
		System.out.println(result);
		
		System.out.println("---HTMLBuilder---");
		System.out.println(fileName);
		
	}
	
}
