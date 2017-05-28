package org.usfirst.frc.team558.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class IntakeUpDown extends Subsystem {

	DoubleSolenoid intakeSol = new DoubleSolenoid(0, 1);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void intakeSolUp(){
    	
    	intakeSol.set(DoubleSolenoid.Value.kReverse);
    	
    }
    
    public void intakeSolDown(){
    	
    	intakeSol.set(DoubleSolenoid.Value.kForward);
    	
    }
}

