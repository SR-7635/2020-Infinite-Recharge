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
  public static final int JOYSTICK_PORT = 0;
  public static final int DRIVE_MASTER_PORT = 1;
  public static final int DRIVE_SLAVE_PORT = 2;
  public static final int LEFT_MASTER_PORT = 3;
  public static final int LEFT_SLAVE_PORT = 4;
  public static final int RIGHT_MASTER_PORT = 5;
  public static final int RIGHT_SLAVE_PORT = 6;
}
