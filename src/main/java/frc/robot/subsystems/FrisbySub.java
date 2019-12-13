/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.FrisbyCom;

/**
 * Add your docs here.
 */

public class FrisbySub extends Subsystem {
  private WPI_TalonSRX motor1;
  private WPI_TalonSRX motor2;
  private Servo loader;
  
  public FrisbySub(){
  motor1.configFactoryDefault();
  motor2.configFactoryDefault();
  motor1.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative,0,0);
  motor2.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative,0,0);
  loader = new Servo(1);
  motor1 = new WPI_TalonSRX(2);
  motor2 = new WPI_TalonSRX(3);
  
  
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  }

  public void option1(){
    //control mode velocity is in 100 millsec
    motor1.set(ControlMode.Velocity,100);
    motor2.set(ControlMode.Velocity,100);
    System.out.println("m1"+ motor1.getSelectedSensorVelocity());
    System.out.println("m2"+ motor2.getSelectedSensorVelocity());
  }
  public void option2(){
    motor1.set(ControlMode.Velocity,200);
    motor2.set(ControlMode.Velocity,200);  
    System.out.println("m1"+ motor1.getSelectedSensorVelocity());
    System.out.println("m2"+ motor2.getSelectedSensorVelocity());
  }
  public void option3(){
    motor1.set(ControlMode.Velocity,300);
    motor2.set(ControlMode.Velocity,300); 
    System.out.println("m1"+ motor1.getSelectedSensorVelocity());
    System.out.println("m2"+ motor2.getSelectedSensorVelocity());
  }
  public void option4(){
    motor1.set(ControlMode.Velocity,400);
    motor2.set(ControlMode.Velocity,400);
    System.out.println("m1"+ motor1.getSelectedSensorVelocity());
    System.out.println("m2"+ motor2.getSelectedSensorVelocity());
  }
  public void loading(){
    loader.set(1);
  }
  public void reset(){
    loader.set(0);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new FrisbyCom());
  }
}
