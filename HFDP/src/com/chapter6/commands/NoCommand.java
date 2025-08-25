package com.chapter6.commands;

import com.chapter6.interfaces.Command;

public class NoCommand implements Command{

	@Override
	public void execute() {
		System.out.println("No actual action is formed yet.");
	}

	@Override
	public void undo() {
		System.out.println("No actual action is formed yet.");
	}

}
