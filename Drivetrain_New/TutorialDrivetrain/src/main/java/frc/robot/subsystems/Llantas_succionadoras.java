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
import frc.robot.commands.ChupaCajas;

/**
 * Add your docs here.
 */
public class Llantas_succionadoras extends Subsystem 
{

  private Spark SuccionadorCentro = new Spark(RobotMap.LlantaCentro);
  private Spark SuccionadorBrazo = new Spark(RobotMap.Llanta_Brazo);
  //private Spark SuccionadorArriba = new Spark(RobotMap.Llanta_Arriba);

  
  //private Spark SuccionadorLeft2 = new Spark(RobotMap.LlantaIzq_2);
  //private Spark SuccionadorRight2 = new Spark(RobotMap.LlantaDer_2);

  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() 
  {
    setDefaultCommand(new ChupaCajas());
  }

  public void setSuccionadores(double speed)
  {
    SuccionadorCentro.set(speed);
    SuccionadorBrazo.set(speed);
 
    //SuccionadorLeft2.set(speed);
   // SuccionadorRight1.set(speed);
  }






  //public void setRightMotorS(double speed, double d)
  //{
    //SuccionadorLeft1.set(speed);
    //SuccionadorRight1.set(-speed);
  //}





}
