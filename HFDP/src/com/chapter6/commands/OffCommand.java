package com.chapter6.commands;

import com.chapter6.interfaces.Command;
import com.chapter6.receivers.GenericReceiver;

public class OffCommand implements Command{

	private GenericReceiver receiver;
	
	public OffCommand(GenericReceiver receiver) {
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		this.receiver.off();
	}
	


}
