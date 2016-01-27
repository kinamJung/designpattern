package com.hanains.memento;

import java.util.ArrayList;
import java.util.List;


/*
 * 		Memento : Originator 역할의 내부 정보를 정리한다. Memento 역할은 Originator 역할의 내부 정보를 가지고 있지만,
 * 				  그 정보를 누구에게도 공개하지 않는다. Memento의 역할은 다음 두 종류의 인터페이스를 가지고 있다.
 * 
 * 			1. wide interface: 오브 젝트의 상태를 원래 상태로 돌리기 위해 필요한 정보를 모두 얻을 수 있는 메소드 집합이다.
 * 			2. narrow interface: 외부의 Caretaker class에게 보여주는 것이다. 이 인터페이스로 할 수 있는 일에는
 * 								 한계가 있고 내부 상태가 외부에 공개되는 것을 방지한다. 
 * 
 * 
 * */
public class Memento {

	int money;
	ArrayList<String> fruits;
	
	//narrow interface : 외부의 Caretaker class에게 보여주는 것
	public int getMoney() { 
		return money;
	}

	//wide interface : 오브젝트의 상태를 원래의 상태로 돌리기 위해 Originator class에서 접근
	public Memento(int money) {
		this.money = money;
		this.fruits = new ArrayList<>();
	}
	
	void addFruit(String fruit){
		fruits.add(fruit);
	}


	@SuppressWarnings("unchecked")
	public ArrayList<String> getFruits() {
		return (ArrayList<String>)fruits.clone();
	}
	
	
}
