package com.hanains.bridge;

/*
 * 
 *  Bridge Pattern
 *   - 구현부에서 추상층을 분리하여 각자 독립적으로 변형할 수 있게 하는 패턴이다.
 *     즉, 기능과 구현을 별도의 클래스로 정의해서 서로를 분리하는 방법이다.
 * 	 - 참고. Adapter Pattern
 * */

public class BridegeTest {
	
	public static void main(String[] args) {
		ConcreteImplementorA impl = new ConcreteImplementorA();
		ConcreteImplementorB impl2 = new ConcreteImplementorB();
		
		RefinedAbstraction concreteAbstraction = new RefinedAbstraction(impl);
		concreteAbstraction.operation();
		
		RefinedAbstraction concreAbstraction2 = new RefinedAbstraction(impl2);
		concreAbstraction2.operation();
		
	}
	
}
