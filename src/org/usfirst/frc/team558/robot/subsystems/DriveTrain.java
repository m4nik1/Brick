package org.usfirst.frc.team558.robot.subsystems;

import org.usfirst.frc.team558.robot.Robot;
import org.usfirst.frc.team558.robot.commands.ElmCityDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;


public class DriveTrain extends Subsystem {

	VictorSP leftDriveMaster = new VictorSP(0);
	VictorSP leftDriveSlave1 = new VictorSP(1);
	VictorSP rightDriveMaster = new VictorSP(2);
	VictorSP rightDriveSlave1 = new VictorSP(3);
    
	public void drive(double leftPower, double rightPower){
		this.leftDriveMaster.set(-leftPower);
		this.leftDriveSlave1.set(-leftPower);
		
		this.rightDriveMaster.set(rightPower);
		this.rightDriveSlave1.set(rightPower);
	}

    public void initDefaultCommand() {
        
    	setDefaultCommand(new ElmCityDrive());
    	
    }
}

