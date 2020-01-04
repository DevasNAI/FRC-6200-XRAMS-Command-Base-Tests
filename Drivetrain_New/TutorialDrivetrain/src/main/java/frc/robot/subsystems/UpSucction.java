/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
//import frc.robot.commands.UpVaccum;

/**
 * Add your docs here.
 */
public class UpSucction extends Subsystem
 {
  private Spark SuccionadorArriba = new Spark(RobotMap.Llanta_Arriba);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() 
  {
    //setDefaultCommand(new UpVaccum());
    //setDefaultCommand(new UpSucction);
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void setUpSuccionador(double u_speed)
  {
    SuccionadorArriba.set(-u_speed);
  }


}

