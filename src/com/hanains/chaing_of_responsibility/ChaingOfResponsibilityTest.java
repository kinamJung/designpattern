package com.hanains.chaing_of_responsibility;

/*
 * 
 * 			책임 연쇄 패턴
 * 			- 자기가 해결할 수 있는 문제는 해결하고 그렇지 못한 경우 다음으로 책임을 떠 넘긴다.
 * 
 * 
 * 
 * 
 * */

public class ChaingOfResponsibilityTest {

	public static void main(String[] args) {
		Support alice = new NoSupport("Alice");
		Support bob = new LimitSupport("bob", 100);
		Support charlie = new SpecialSupport("Charle", 429);
		Support diana = new LimitSupport("Diana", 200);
		Support elmo = new OddSupport("Elmo");
		Support fred = new LimitSupport("Fred", 300);
		
		//Make Chain
		//Trouble은 NoSupport -> LimitSupport 100 -> SpecialSupport 429 -> LimitSupport 200
		//		   -> OddSupport -> LimitSupport 300 순으로 처리를 시도한다.
		alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
		
		for(int i = 0 ; i < 500 ; i = i + 33){
			// 트러블을 발생시키고 alice부터 처리를 시도한다.
			// 이때 alice가 처리하지 못할 경우 사슬을 따라 다니며 문제 해결을 시도한다.
			alice.support(new Trouble(i));
		}
		
		
	}
}
