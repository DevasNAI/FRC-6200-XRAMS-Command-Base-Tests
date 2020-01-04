/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Pneumatics extends Subsystem
{
  //  Solenoides
  public Solenoid Sol1 = new Solenoid(RobotMap.soliPort1);
  public Solenoid Sol2 = new Solenoid(RobotMap.soliPort2);
  public Solenoid Sol3 = new Solenoid(RobotMap.soliPort3);
  public Solenoid Sol4 = new Solenoid(RobotMap.soliPort4);

  //  Compresor
  public Compressor Compi1 = new Compressor(RobotMap.Compressor1);




  public void setSol1(boolean estado)
  {
    Sol1.set(estado);
  }
  public void setSol2(boolean estado)
  {
    Sol2.set(estado);
  }
  public void setSol3(boolean estado)
  {
    Sol3.set(estado);
  }
  public void setSol4(boolean estado)
  {
    Sol4.set(estado);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
