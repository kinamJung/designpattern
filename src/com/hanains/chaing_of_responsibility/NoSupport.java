package com.hanains.chaing_of_responsibility;

// 문제를 해결 못하는 클래스
public class NoSupport extends Support {

	public NoSupport(String name) {
		super(name);
	}
	
	@Override
	protected boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		return false;
	}

}
