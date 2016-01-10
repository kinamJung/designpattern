package com.hanains.command;

public class StereoOnWithCDCommand implements Command {

	private Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	@Override
	public void excute() {

		stereo.on();
		stereo.setCd();
		stereo.setVolume();
		
	}

}
