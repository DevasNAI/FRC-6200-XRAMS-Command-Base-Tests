/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import frc.robot.Robot;
import frc.robot.RobotMap;

public class DrivingCommand extends Command {
  public DrivingCommand() 
  {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.drivetrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() 
  {
    double RightStickY = Robot.oi.agarraY(RobotMap.RStickY);
    double LeftStickY = Robot.oi.agarraY(RobotMap.LStickY);
    double RightStickX = Robot.oi.agarraX(RobotMap.RStickX);
    //double LeftStickX = Robot.oi.agarraX(RobotMap.LStickX);


    Robot.drivetrain.ManejoMecanum(RightStickX, LeftStickY, RightStickY, 0.0);
  
    //  Lateral X, Avance Y, Rotación Z. 
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
