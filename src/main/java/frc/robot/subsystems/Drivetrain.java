// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  private Spark frontL, frontR, backL, backR;
  private MotorControllerGroup left, right;
  private DifferentialDrive drive;


  /** Creates a new Drivetrain. */
  public Drivetrain() 
  {
    frontL = new Spark(Constants.FRONTL);
    frontR = new Spark(Constants.FRONTR);
    backL = new Spark(Constants.BACKL);
    backR = new Spark(Constants.BACKR);

    left = new MotorControllerGroup(frontL, backL);
    right = new MotorControllerGroup(frontR, backR);

    drive = new DifferentialDrive(left, right);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  

  public void tankDrive(double leftSpeed, double rightSpeed) 
  {
    drive.tankDrive(leftSpeed, rightSpeed);
  }
}







