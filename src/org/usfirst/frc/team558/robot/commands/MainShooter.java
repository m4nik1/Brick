package org.usfirst.frc.team558.robot.commands;

import org.usfirst.frc.team558.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


public class MainShooter extends Command {

    public MainShooter() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.shooter);
        requires(Robot.ballIntake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double shooterAxis = Robot.oi.GetFeeder();
    	if (shooterAxis < -.3 ){
    		Robot.shooter.setShooter(-1);
    		Robot.ballIntake.setIntake(-1);
    	}
    	else if (shooterAxis > .3){
    		Robot.shooter.setShooter(1);
    	}
    	else{
    		Robot.shooter.setShooter(0);
    		Robot.ballIntake.setIntake(0);
    	}
    	
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
