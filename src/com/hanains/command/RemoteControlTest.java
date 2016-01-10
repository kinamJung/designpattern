package com.hanains.command;

public class RemoteControlTest {

	public static void main(String[] args) {

		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		Command LightOn = new LightOnCommand(light);
		
		remote.setSlot(LightOn);
		remote.buttonWasPressed();
		
	}

}
