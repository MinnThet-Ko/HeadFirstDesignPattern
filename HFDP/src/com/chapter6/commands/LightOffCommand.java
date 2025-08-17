package com.chapter6.commands;

import com.chapter6.interfaces.Command;
import com.chapter6.receivers.Light;

public class LightOffCommand implements Command{
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.on();
	}

}
