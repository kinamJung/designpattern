package com.hanains.Adapter;

public class DuckTestDrive {

	public static void main(String[] args) {
		
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says....");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\r\nThe Duck says....");
		testDuck(duck);
		
		System.out.println("\r\nThe TurkeyAdapter says....");
		testDuck(turkeyAdapter);
		
	}
	static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

}
