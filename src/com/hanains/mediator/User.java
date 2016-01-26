package com.hanains.mediator;

import com.hanains.mediator.Interface.Colleague;
import com.hanains.mediator.Interface.Mediator;

public class User extends Colleague {

	
	public User(Mediator mediator, String mName) {
		super(mediator, mName);
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println( mName + "send: " + msg);
		super.mediator.sendMessage(msg, this);
	}

	@Override
	public void recvMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println( mName + "recv: " + msg);
	}

}
