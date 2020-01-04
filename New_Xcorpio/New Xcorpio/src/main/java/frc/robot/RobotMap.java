/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {


  //  Motores Mecanum

	public static final int NorthLM = 5;
	public static final int SouthLM = 9;
	public static final int NorthRM = 4;
  public static final int SouthRM = 7;
  


  //  Puertos de Solenoides

  public static final int soliPort1 = 0;
  public static final int soliPort2 = 1;
  public static final int soliPort3 = 2;
  public static final int soliPort4 = 3;
  
  //  Puertos Compresor

  public static final int Compressor1 = 0;


  //  Control de Xbox

	public static final int Cont1 = 0;

  //  Joysticks de Xbox

	public static final int RStickY = 5;
	public static final int LStickY = 1;
	public static final int RStickX = 4;
  public static final int LStickX = 0;

  //  Botones de control de Xbox
  public static final int botonY = 5;






  


  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
