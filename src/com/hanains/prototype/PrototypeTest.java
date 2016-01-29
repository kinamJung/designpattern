package com.hanains.prototype;


/**
 * 
 * Prototype Pattern
 *  -> 인스턴스 복제. Clonable를 구현해서 소스에서 new를 사용하지 않고도 new한 효과를 거둘 수 있다.
 * 
 * @author Kinam Jung
 * @since 2015.01.29
 * 
 *
 */
public class PrototypeTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype prototype = new PrototypeImpl(10);
		Prototype tempPrototype = prototype.clone(); // 객체 복제
		
		int num;
		num = prototype.getX();
		System.out.println("Prototype's value:" + num);
		
		num = tempPrototype.getX();
		System.out.println("TempPrototype's value:" + num);
		
		tempPrototype.setX(20); // 객체 수정
			
		num = tempPrototype.getX();
		System.out.println("TempPrototype's value:" + num);
		
		num = prototype.getX();
		System.out.println("Prototype's value:" + num);
	}
}
