package com.hanains.command;

public class SimpleRemoteControl {

	private Command slot;
	public SimpleRemoteControl() {
	}

	public void setSlot(Command slot) {
		this.slot = slot;
	}
	
	public void buttonWasPressed(){
		slot.excute();
	}
	
}
