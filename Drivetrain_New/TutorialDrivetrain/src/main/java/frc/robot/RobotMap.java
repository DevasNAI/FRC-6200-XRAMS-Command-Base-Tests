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



  // Movimiento Control 1
  public static final int Driver_Controller_1 = 0;            //  Control 1 (Movimiento del robot)
  public static final int Left_StickY = 1;
  public static final int Right_Stick_Y = 5;
  public static final int Left_StickX = 0;
  public static final int RightStick_X = 4;


  //  Botones de Control 2
  public static final int Driver_Controller_2 = 1;             //  Control 2 (Acciones del robot)
  public static final int Button_A = 1;
  public static final int Button_B = 2;
  public static final int Button_X = 3;
  public static final int Button_Y = 4;
  public static final int Button_LB = 5;
  public static final int Button_RB = 6;
  public static final int Button_X2 = 0;
  public static final int Left_Trigger = 2;
  public static final int Right_Trigger = 3;




  //  Succiona cajas
    public static final int LlantaCentro = 4;
    public static final int Llanta_Brazo = 5;
    public static final int Llanta_Arriba = 2;
    //  Succionadores \ expulsadores de arriba



  //  Motores Drivetrain
	public static final int LeftMotor1_ID = 0;
	public static final int LeftMotor2_ID = 8;
	public static final int RightMotor1_ID = 1;
  public static final int RightMotor2_ID = 7;
public static final int PuertoSolenoide1 = 0;
public static final int PuertoSolenoide2 = 1;
public static final int PuertoSolenoide3 = 3;
public static final int Compressorport = 0;








  
  


  

  
    // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
