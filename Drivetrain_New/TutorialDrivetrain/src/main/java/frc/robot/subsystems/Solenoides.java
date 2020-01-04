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
import frc.robot.commands.Pistones;

/**
 * Add your docs here.
 */

public class Solenoides extends Subsystem 
{
  public Solenoid sol1 = new Solenoid(RobotMap.PuertoSolenoide1);
  private Solenoid sol2 = new Solenoid(RobotMap.PuertoSolenoide2);
  private Solenoid sol3 = new Solenoid(RobotMap.PuertoSolenoide3);
  private Compressor Compressor1 = new Compressor(RobotMap.Compressorport);


  public void CompressorInit(boolean Estado)
  {

    Compressor1.setClosedLoopControl(Estado);
  }

 
  public void setSolenoid1(boolean Estado1)
  {

    sol1.set(Estado1);

  }


  public void setSolenoid2(Boolean Estado3)
  {

    sol2.set(Estado3);

  }

  public void setSolenoid3(Boolean Estado)
  {

    sol3.set(Estado);
  }


  @Override
  public void initDefaultCommand()
  
  {
   
    setDefaultCommand(new Pistones());
// https://wpilib.screenstepslive.com/s/currentCS/m/cpp/l/241866-operating-pneumatic-cylinders-solenoids
  

  }
}
