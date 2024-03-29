// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class KickerSubsystem extends SubsystemBase {
  
    private CANSparkMax kickerMotor;


  public KickerSubsystem() {

    kickerMotor = new CANSparkMax (22, MotorType.kBrushless);
    kickerMotor.restoreFactoryDefaults();
    kickerMotor.setSmartCurrentLimit(80);
  }




  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

 public void setKickerSpeed(double voltage) {
    kickerMotor.set(voltage);
 }
}
