package com.chapter6.commands;

import com.chapter6.interfaces.Command;
import com.chapter6.receivers.GarageDoor;

public class GarageDoorOpenCommand implements Command {

	GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	@Override
	public void execute() {
		this.garageDoor.up();

	}

}
