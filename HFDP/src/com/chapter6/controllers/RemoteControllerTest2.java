package com.chapter6.controllers;

import com.chapter6.commands.OffCommand;
import com.chapter6.commands.OnCommand;
import com.chapter6.interfaces.Command;
import com.chapter6.receivers.CeilingFan;
import com.chapter6.receivers.GarageDoor;
import com.chapter6.receivers.Light;
import com.chapter6.receivers.StereoWithCD;

public class RemoteControllerTest2 {
	
	public static void main(String args[]) {
		
		Light kitchenLights = new Light("Kitchen");
		Light livingRoomLights = new Light("Living Room");
		GarageDoor garageDoor =  new GarageDoor("");
		StereoWithCD stereo = new StereoWithCD("");
		CeilingFan ceilingFan = new CeilingFan("bedroom");
		
		OnCommand kitchenLightsOnCommand = new OnCommand(kitchenLights);
		OffCommand kitchenLightsOffCommand = new OffCommand(kitchenLights);
		
		OnCommand livingLightsOnCommand = new OnCommand(livingRoomLights);
		OffCommand livingLightsOffCommand = new OffCommand(livingRoomLights);
		
		OnCommand garageDoorsOnCommand = new OnCommand(garageDoor);
		OffCommand garageDoorOffCommand = new OffCommand(garageDoor);
		
		OnCommand stereoLightsOnCommand = new OnCommand(stereo);
		OffCommand stereoLightsOffCommand = new OffCommand(stereo);
		
		OnCommand ceilingFanOnCommand = new OnCommand(ceilingFan);
		OffCommand ceilingFanOffCommand = new OffCommand(ceilingFan);
		
		
		RemoterController controller = new RemoterController(5);
		controller.setCommand(0, kitchenLightsOnCommand, kitchenLightsOffCommand);
		controller.setCommand(1, livingLightsOnCommand, livingLightsOffCommand);
		controller.setCommand(2, garageDoorsOnCommand, garageDoorOffCommand);
		controller.setCommand(3, stereoLightsOnCommand, stereoLightsOffCommand);
		controller.setCommand(4, ceilingFanOnCommand, ceilingFanOffCommand);
		
		System.out.println("------------------------ Command Testing ------------------------");
		controller.pushOnButton(2);
		controller.pushOnButton(1);
		controller.pushOffButton(2);
		controller.pushOnButton(3);
		controller.pushOnButton(0);
		controller.pushOffButton(3);
		controller.pushOffButton(0);
		controller.pushOnButton(4);
		
	}

}
