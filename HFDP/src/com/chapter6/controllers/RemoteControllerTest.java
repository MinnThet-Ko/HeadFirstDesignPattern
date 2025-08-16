package com.chapter6.controllers;

import com.chapter6.commands.GarageDoorOpenCommand;
import com.chapter6.commands.LightOnCommand;
import com.chapter6.receivers.GarageDoor;
import com.chapter6.receivers.Light;

public class RemoteControllerTest {

	public static void main(String[] args) {
		
		SimpleRemoteController remote = new SimpleRemoteController();
		
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		
		
		remote.setCommand(lightOnCommand);
		
		remote.pressButton();
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
		
		
		remote.setCommand(garageDoorOpenCommand);
		
		remote.pressButton();

	}

}
