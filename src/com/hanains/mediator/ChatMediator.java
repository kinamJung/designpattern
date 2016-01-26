package com.hanains.mediator;

import java.util.ArrayList;
import java.util.List;

import com.hanains.mediator.Interface.Colleague;
import com.hanains.mediator.Interface.Mediator;

public class ChatMediator implements Mediator {

	private List<Colleague> mList;
	
	
	public ChatMediator() {
		mList = new ArrayList<>();
	}

	@Override
	public void appendUser(Colleague colleague) {
		// TODO Auto-generated method stub
		mList.add(colleague);
	}

	@Override
	public void removeUser(Colleague colleague) {
		// TODO Auto-generated method stub
		mList.remove(colleague);
	}

	@Override
	public void sendMessage(String msg, Colleague sender) {
		// TODO Auto-generated method stub
		for( Colleague c : mList ){
			if( c != sender){
				c.recvMessage(msg);
			}
		}
	}

}
