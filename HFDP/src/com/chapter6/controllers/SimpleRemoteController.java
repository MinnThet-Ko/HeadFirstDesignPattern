package com.chapter6.controllers;

import com.chapter6.interfaces.Command;

public class SimpleRemoteController {
	
	private Command slot;
	
	public SimpleRemoteController() {

	}
	
	public void setCommand(Command slot) {
		this.slot = slot;
	}
	
	public void pressButton() {
		this.slot.execute();
	}

}
