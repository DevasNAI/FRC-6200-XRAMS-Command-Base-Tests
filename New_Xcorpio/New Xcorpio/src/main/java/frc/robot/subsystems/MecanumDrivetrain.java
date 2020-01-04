/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;


import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

import frc.robot.RobotMap;
import frc.robot.commands.DrivingCommand;

/**
 * Add your docs here.
 */
public class MecanumDrivetrain extends Subsystem 

{

  public WPI_TalonSRX LNorthMotor = new WPI_TalonSRX(RobotMap.NorthLM);
  public WPI_TalonSRX LSouthMotor = new WPI_TalonSRX(RobotMap.SouthLM);
  public WPI_TalonSRX RNorthMotor = new WPI_TalonSRX(RobotMap.NorthRM);
  public WPI_TalonSRX RSouthMotor = new WPI_TalonSRX(RobotMap.SouthRM);

  
  public MecanumDrivetrain()
  {
    LNorthMotor.setInverted(true);
    RNorthMotor.setInverted(true);
  }


  public MecanumDrive MecanumDriveMove = new MecanumDrive(LNorthMotor, LSouthMotor, RNorthMotor, RSouthMotor);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  

  public void ManejoMecanum(double move, double slide, double diag, double GiroAngular)
  {
    MecanumDriveMove.driveCartesian(move, slide, diag, GiroAngular);
    ///MecanumDriveMove.driveCartesian(move, slide, diag);


  }


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DrivingCommand());
  }
}
