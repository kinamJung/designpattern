package com.hanains.memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/*
 * 
 * 	Originator : 자신의 현재 상태를 저장하고 싶을 때 Memento를 만든다. 또한 이전의 Memento object를 전달 받으면
 * 				 그 Memento object를 만든 시점의 	상태로 돌리는 처리를 실행한다.
 * 
 * 
 * 
 * */

public class Originator {

	private int money;
	private List<String> fruits = new ArrayList<>();
	private Random random = new Random();
	private static String[] fruitName = {"사과","포도", "바나나", "귤"};
	
	public Originator(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}
	
	public void bet(){
		
		int dice = random.nextInt(6) + 1;
		switch (dice) {
		case 1:	
			money = money + 100;
			System.out.println("소지금이 증가하였습니다.");
			break;
		case 2:
			money = money / 2;
			System.out.println("소지금이 절반이 되었습니다.");
			break;
		case 6:
			String f = getFruit();
			System.out.println("과일("+f+")을 받았습니다.");
			break;
		default:
			System.out.println("변한 것이 없습니다.");
			break;
		}
		
	}
	
	public Memento createMemento(){
		Memento m = new Memento(money);
		Iterator it = fruits.iterator();
		
		while(it.hasNext()){
			String f = (String)it.next();
			if(f.startsWith("맛있는")){
				m.addFruit(f);
			}
			
		}
		return m;
	}
	
	public void restoreMemento(Memento memento){
		this.money = memento.money;
		this.fruits = memento.getFruits();
	}
	
	@Override
	public String toString() {
		return "[money="+"money"+", fruits="+"fruits"+"]";
	}

	private String getFruit(){
		
		String preFix = "";
		if(random.nextBoolean()){
			preFix = "맛있는";
		}
		return preFix + fruitName[random.nextInt(fruitName.length)];
	}
	
	
}
