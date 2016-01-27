package com.hanains.memento;



/*
 * 		Caretaker: 현재의 Originator 역할의 상태를 저장하고 싶을 때, 그것을 Originator 역할에게 전한다. Originator 역할은
 * 					그것을 받아서 Memento 역할을 만들어 Caretaker 역할에게 전달한다. Caretaker 역할은 미래의 필요에 대비해서
 * 					그 Memento 역할을 저장해 준다.
 * 					Caretaker 역할은 Memento 역할이 갖는 2종류의 인터페이스중에서 narrow interface만 사용할 수 있으므로 
 * 					Memento 역할의 내부 정보에 엑세스 할 수 있다.
 * 
 * 
 * */
public class Caretaker {

	public static void main(String[] args) {
		
		Originator originator = new Originator(100);
		Memento memento = originator.createMemento();
		
		for(int i = 0 ; i < 10 ; i++){
			System.out.println("===="+i);
			System.out.println("현상:"+originator);
			
			originator.bet();
			
			System.out.println("소지금은 " + originator.getMoney()+"원이 되었습니다.");
			
			if(originator.getMoney() > memento.getMoney()){
				System.out.println("(많이 증가 하였으므로 현재의 상태를 저장하자)");
				memento = originator.createMemento();
			}else if(originator.getMoney() < memento.getMoney()){
				System.out.println("많이 감소했으므로 이전의 상태로 복원하자");
				originator.restoreMemento(memento);
			}
		}
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}
	
}
