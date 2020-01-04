/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

//import com.ctre.phoenix.motorcontrol.ControlMode;
//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
//import com.ctre.phoenix.motorcontrol.can.VictorSPX;

//import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

//import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.Spark;
//import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem 
{

  private Spark leftMotor1 = new Spark(RobotMap.LeftMotor1_ID);
  //private Spark leftMotor2 = new Spark(RobotMap.LeftMotor2_ID);
  private Spark rightMotor1 = new Spark(RobotMap.RightMotor1_ID);
  //private Spark rightMotor2 = new Spark(RobotMap.LeftMotor2_ID);
  // private VictorSP leftMotor1 = new VictorSP(RobotMap.Left_Motor1_ID);


  


  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() 
  {
    setDefaultCommand(new TankDrive());

    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void setLeftMotors(double speed)
  {

    leftMotor1.set(-speed);
    //leftMotor2.set(speed);

  }

  //  Son los motores de izquierda

  public void setRightMotors(double speed)
  {

    rightMotor1.set(speed);
    //rightMotor2.set(-speed);

  }

  // Son los motores de derecha
}
