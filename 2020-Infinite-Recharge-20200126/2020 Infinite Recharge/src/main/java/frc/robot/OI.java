/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.DriveForward;
import frc.robot.commands.DriveStop;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  Joystick joystick1 = new Joystick(RobotMap.JOYSTICK_PORT);
  Button button1 = new JoystickButton(joystick1, 1); 
  Button button2 = new JoystickButton(joystick1, 2);
  
  public OI() {
    button1.whenPressed(new DriveForward()); 
    button2.whenPressed(new DriveStop());
  }
  // button.whenPressed(new ExampleCommand());
  // button.whileHeld(new ExampleCommand());
  // button.whenReleased(new ExampleCommand());

  public double getDrivingJoystickY(){
    return joystick1.getY();
    }
    
    public double getDrivingJoystickX(){
    return joystick1.getX();
    }
    
}
