package org.usfirst.frc.team558.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.*;

public class BallIntake extends Subsystem {

    VictorSP intake = new VictorSP(5);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setIntake(double speed){
    	
    	intake.set(speed);
    	
    }
}

