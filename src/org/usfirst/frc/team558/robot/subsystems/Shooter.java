package org.usfirst.frc.team558.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team558.robot.commands.*;

import edu.wpi.first.wpilibj.*;


public class Shooter extends Subsystem {

    VictorSP shooter = new VictorSP(4);

    public void initDefaultCommand() {
        
    	setDefaultCommand(new MainShooter());
    	
    }
    
    public void setShooter(double speed){
    	
    	shooter.set(speed);
    	
    }
    
    
    
}

