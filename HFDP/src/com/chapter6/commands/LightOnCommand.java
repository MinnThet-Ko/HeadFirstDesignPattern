package com.chapter6.commands;

import com.chapter6.interfaces.Command;
import com.chapter6.receivers.Light;

public class LightOnCommand implements Command{
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.on();
	}

}
