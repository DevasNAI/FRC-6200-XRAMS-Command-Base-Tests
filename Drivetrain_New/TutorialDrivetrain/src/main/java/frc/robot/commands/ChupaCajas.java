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

public class ChupaCajas extends Command {


  public ChupaCajas()
   {

    requires(Robot.LlantasSuccionadoras);
     
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() 
  {
    double LTrigger = Robot.m_oi.GetTriglef(RobotMap.Left_Trigger);
    double RTrigger = Robot.m_oi.GetTrider(RobotMap.Right_Trigger);

    int activado = 1;
    int apagado = 0;
    if(LTrigger == activado ) {
      Robot.LlantasSuccionadoras.setSuccionadores(1);
    }
    else if(RTrigger == activado){
      Robot.LlantasSuccionadoras.setSuccionadores(-1);
    }
  
    else{
      Robot.LlantasSuccionadoras.setSuccionadores(apagado);
    }
   // Robot.LlantasSuccionadoras.setSuccionadores(.3);
   
  }
    //Robot.LlantasSuccionadoras.setRightMotorS(LTrigger, 0.5);
    //Robot.LlantasSuccionadoras.setRightMotorS(RTrigger, -0.5);

  

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() 
  {
    //Robot.LlantasSuccionadoras.setRightMotorS(0);
    //Robot.LlantasSuccionadoras.setSuccionadores(0);

  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
