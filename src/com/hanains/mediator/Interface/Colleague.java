package com.hanains.mediator.Interface;

public abstract class Colleague {

	protected Mediator mediator;
	protected String mName;
	
	public Colleague(Mediator mediator, String mName) {
		this.mediator = mediator;
		this.mName = mName;
	}
	
	abstract public void sendMessage(String msg);
	abstract public void recvMessage(String msg);
	
}
