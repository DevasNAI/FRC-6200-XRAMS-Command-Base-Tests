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


public class Pistones extends Command 
{
  public Pistones() 
  {
    requires(Robot.solenoides);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize()
  {
    Robot.solenoides.CompressorInit(true);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() 
  {

    boolean LBumper = Robot.m_oi.ButtonLB(RobotMap.Left_Trigger);
    boolean RBumper = Robot.m_oi.ButtonRB(RobotMap.Right_Trigger);
    
    
    if(LBumper)
    {
      Robot.solenoides.setSolenoid1(true);
      Robot.solenoides.setSolenoid2(true);
    }
    
    else if(RBumper)
    {
      Robot.solenoides.setSolenoid1(false);
      Robot.solenoides.setSolenoid2(false);
    }





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
    Robot.solenoides.setSolenoid1(false);
    Robot.solenoides.setSolenoid2(false);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
