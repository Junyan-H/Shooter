/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class FrisbyCom extends Command {
  private int num;

  public FrisbyCom() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.fsub);
  }

  public FrisbyCom(int n) {
    num = n;
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    switch (num) {
    case 1:
      Robot.fsub.option1();
      break;
    case 2:
      // do stuff
      Robot.fsub.option2();
      break;
    case 3:
    Robot.fsub.option3();
      // do stuff
      break;
    case 4:
    Robot.fsub.option4();
      // do stuff
      break;
    }

    /*
     * if(Robot.m_oi.buttonO1.get()== true){ Robot.fsub.option1(); }
     * if(Robot.m_oi.buttonO2.get()== true){ Robot.fsub.option2(); }
     * if(Robot.m_oi.buttonO3.get()== true){ Robot.fsub.option3(); }
     * if(Robot.m_oi.buttonO4.get()== true){ Robot.fsub.option4(); }
     */
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
