package com.hanains.mediator;
/*
 * 		Mediator Pattern
 *        * 모든 클래스간 복잡한 로직을 캡슐화하여 하나의 클래스에 위임하여 처리하는 패턴
 *        * 비슷한 패턴으로 퍼사드 패턴과 옵저버 패턴이 있다.
 *        * 내가 생각하는 적용예) 채팅
 * 
 * 
 * */
public class MediatorTest {

	public static void main(String[] args) {

		ChatMediator chatMediator = new ChatMediator();
		
		User mUser1 = new User(chatMediator, "홍길동");
		User mUser2 = new User(chatMediator, "임꺽정");
		User mUser3 = new User(chatMediator, "둘리");
		
		chatMediator.appendUser(mUser1);
		chatMediator.appendUser(mUser2);
		chatMediator.appendUser(mUser3);
		
		mUser1.sendMessage("안녕하세요. 홍길동 입니다.");
	}

}
