/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.FollowerType;

/**
 * Add your docs here.
 */
public class Chassis extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private WPI_TalonSRX masterLeft;
  private WPI_TalonSRX slaveLeft;
  private WPI_TalonSRX masterRight;
  private WPI_TalonSRX slaveRight;
  private DifferentialDrive drive;

  public Chassis() {
    masterLeft = new WPI_TalonSRX(RobotMap.LEFT_MASTER_PORT);
    slaveLeft = new WPI_TalonSRX(RobotMap.LEFT_SLAVE_PORT);
    masterRight = new WPI_TalonSRX(RobotMap.RIGHT_MASTER_PORT);
    slaveRight = new WPI_TalonSRX(RobotMap.RIGHT_SLAVE_PORT);
    masterLeft.setNeutralMode(NeutralMode.Brake);
    slaveLeft.setNeutralMode(NeutralMode.Brake);
    slaveLeft.follow(masterLeft, FollowerType.PercentOutput);
    masterRight.setNeutralMode(NeutralMode.Brake);
    slaveRight.setNeutralMode(NeutralMode.Brake);
    slaveRight.follow(masterRight, FollowerType.PercentOutput);
    drive = new DifferentialDrive(masterLeft, masterRight);
    drive.setSafetyEnabled(true);
    drive.setExpiration(0.1);
    drive.setMaxOutput(1.0);

  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DriveByJoystick());
  }
  
  public void driveByJoystick(double yDir, double xDir){
    SmartDashboard.putString("driveByJoystick?", yDir + "," + xDir);
    drive.arcadeDrive(yDir,xDir);
  }

  public void stop() {
    drive.stopMotor();
  }  
}
