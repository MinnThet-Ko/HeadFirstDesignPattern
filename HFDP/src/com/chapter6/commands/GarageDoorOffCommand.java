package com.chapter6.commands;

import com.chapter6.interfaces.Command;
import com.chapter6.receivers.GarageDoor;

public class GarageDoorOffCommand implements Command {

	GarageDoor garageDoor;

	public GarageDoorOffCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		this.garageDoor.on();
		this.garageDoor.up();

	}

	@Override
	public void undo() {
		this.garageDoor.off();
		this.garageDoor.down();
	}

}
