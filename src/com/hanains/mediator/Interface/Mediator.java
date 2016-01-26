package com.hanains.mediator.Interface;

public interface Mediator {
	void appendUser(Colleague colleague);
	void removeUser(Colleague colleague);
	void sendMessage(String msg, Colleague sender);
}
