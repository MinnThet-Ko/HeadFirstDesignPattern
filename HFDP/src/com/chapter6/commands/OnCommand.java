package com.chapter6.commands;

import com.chapter6.interfaces.Command;
import com.chapter6.receivers.GenericReceiver;

public class OnCommand implements Command{
	
	private GenericReceiver receiver;
	
	public OnCommand(GenericReceiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		this.receiver.on();
	}

}
