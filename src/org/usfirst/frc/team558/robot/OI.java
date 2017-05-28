package org.usfirst.frc.team558.robot;


import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team558.robot.commands.*;
import edu.wpi.first.wpilibj.XboxController;

public class OI {

	XboxController driveStick = new XboxController(0);
	
	public OI(){ // tessijgflsdjfgpj
		
		JoystickButton intakeSol = new JoystickButton(driveStick, 4);
		JoystickButton secondRoller = new JoystickButton(driveStick, 1);
		
		secondRoller.whileHeld(new SecondRoller());
		
		intakeSol.whileHeld(new IntakeUpDown());
		
	}
	
	
	//Elm City Drive Methods
		public boolean GetQuickTurn(){
			return driveStick.getRawButton(RobotMap.quickTurnButton);
			
		}
		
		public double GetThrottle(){
			double reverse = driveStick.getRawAxis(RobotMap.throttleForwardAxis);
	    	double forward = driveStick.getRawAxis(RobotMap.throttleReverseAxis);

	    	if ((reverse > .1) && (forward >.1)){
	    		return 0;
	    	}
	    	else if (forward > .1){
	    		return forward;
	    	}
	    	else if (reverse > .1){
	    		return -reverse;
	    	}
	    	else
	    		return 0;
		}

		
		public double GetTurn(){
			return -driveStick.getRawAxis(RobotMap.turnAxis);
		}
		
		public double GetFeeder(){
			return driveStick.getRawAxis(3);
		}

}

