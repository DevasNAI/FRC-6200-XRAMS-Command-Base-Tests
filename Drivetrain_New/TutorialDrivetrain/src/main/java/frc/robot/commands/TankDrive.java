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

public class TankDrive extends Command {
  public TankDrive() 
  {
    requires(Robot.driveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() 
  {

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() 
  {
    double leftStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.Left_StickY);
    double rightStickY = Robot.m_oi.GetDriverRawAxis(RobotMap.Right_Stick_Y);
    //double leftStickX = Robot.m_oi.GetDriverRawAxis(RobotMap.Left_StickX);
//    double rightStickX = Robot.m_oi.GetDriverRawAxis(RobotMap.RightStick_X);

    Robot.driveTrain.setLeftMotors(leftStickY * 0.5);
    Robot.driveTrain.setRightMotors(rightStickY * 0.5 );
    //Robot.driveTrain.setLeftMotors(leftStickX * 0.5);
   // Robot.driveTrain.setRightMotors(rightStickX * 0.5);

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() 
  {

    Robot.driveTrain.setLeftMotors(0);
    Robot.driveTrain.setRightMotors(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
