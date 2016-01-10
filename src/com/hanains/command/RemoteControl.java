package com.hanains.command;

import java.util.Arrays;

public class RemoteControl {

	private Command[] onCommands;
	private Command[] offCommands;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommandImpl();
		for(int i = 0 ; i < 7 ; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot){
		onCommands[slot].excute();
	}
	
	public void offButtonWasPushed(int slot){
		offCommands[slot].excute();
	}

	
	
	@Override
	public String toString() {
	
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------- Remote Control -------\n");
		for(int i = 0 ; i< onCommands.length; i++){
			stringBuff.append("[onCommands=" + Arrays.toString(onCommands) + ", offCommands="
					+ Arrays.toString(offCommands) + "]");
		}
		
		return stringBuff.toString();
	}
	

	
}
