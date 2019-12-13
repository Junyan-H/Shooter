/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.FrisbyCom;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public Joystick leftJoy;
  public Joystick rightJoy;
  public Joystick mechJoy;
  public JoystickButton buttonR;
  public JoystickButton buttonL;
  public JoystickButton buttonF;
  public JoystickButton buttonB;
  public JoystickButton buttonI;
  public JoystickButton buttonO;
  public JoystickButton buttonO1;
  public JoystickButton buttonO2;
  public JoystickButton buttonO3;
  public JoystickButton buttonO4;

 public  OI() {
    leftJoy = new Joystick(0);
    rightJoy = new Joystick(1);
    mechJoy = new Joystick(2);
    buttonR = new JoystickButton(rightJoy,1);
    buttonL = new JoystickButton(leftJoy, 1);
    buttonF = new JoystickButton(mechJoy, 1);   
    buttonO1 = new JoystickButton(leftJoy,2);
    buttonO2 = new JoystickButton(leftJoy,3);
    buttonO3 = new JoystickButton(leftJoy,4);
    buttonO4 = new JoystickButton(leftJoy,5);
    buttonB = new JoystickButton(mechJoy, 2);
    buttonI = new JoystickButton(mechJoy, 5);
    buttonO = new JoystickButton(mechJoy, 3);

    buttonO1.whenPressed(new FrisbyCom(1));
    buttonO2.whenPressed(new FrisbyCom(2));
    buttonO3.whenPressed(new FrisbyCom(3));
    buttonO4.whenPressed(new FrisbyCom(4));
    
  }

  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
