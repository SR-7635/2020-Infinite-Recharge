/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.FollowerType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;


/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private WPI_TalonSRX masterTalon;
  private WPI_TalonSRX slaveTalon;

  public DriveTrain() {
    masterTalon = new WPI_TalonSRX(RobotMap.DRIVE_MASTER_PORT);
    slaveTalon = new WPI_TalonSRX(RobotMap.DRIVE_SLAVE_PORT);
    slaveTalon.follow(masterTalon, FollowerType.PercentOutput);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void forward() {
    masterTalon.set(0.1);
  }
  
  // spins the motor backward
  public void backward() {
    masterTalon.set(-0.1);
  }
  
  // stops spinning the motor
  public void stop() {
    masterTalon.set(0);
  }
  
}
