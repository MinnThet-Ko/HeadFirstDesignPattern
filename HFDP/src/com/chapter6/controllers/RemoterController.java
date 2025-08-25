package com.chapter6.controllers;

import com.chapter6.commands.NoCommand;
import com.chapter6.interfaces.Command;

public class RemoterController {
	
	public Command[] onCommands;
	public Command[] offCommands;
	public Command undoCommand;
	
	public RemoterController(int numberOfSlots) {
		this.onCommands = new Command[numberOfSlots];
		this.offCommands = new Command[numberOfSlots];
		
		for(int i = 0; i < numberOfSlots; i++) {
			this.onCommands[i] = new NoCommand();
			this.offCommands[i] = new NoCommand();
		}
		
		this.undoCommand = new NoCommand();
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}
	
	public void pushOnButton(int slot) {
		this.onCommands[slot].execute();
		this.undoCommand = this.onCommands[slot];
	}
	
	public void pushOffButton(int slot) {
		this.offCommands[slot].execute();
		this.undoCommand = this.offCommands[slot];
	}
	
	public void pushUndoButton() {
		this.undoCommand.undo();
	}
}
