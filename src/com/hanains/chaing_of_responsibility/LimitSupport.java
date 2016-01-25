package com.hanains.chaing_of_responsibility;

public class LimitSupport extends Support {

	private int limit;
	
	public LimitSupport(String name, int limit){
		super(name);
		this.limit = limit;
	}

	@Override
	// 해결용 메소드
	protected boolean resolve(Trouble trouble) {
	
		if(trouble.getNumber() < limit){
			return true;
		}
		return false;
	}
	
}
