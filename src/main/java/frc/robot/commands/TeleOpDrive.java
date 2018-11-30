/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.DriveSubsystem;

import java.awt.*;

/**
 * An example command.  You can replace me with your own command.
 */
public class TeleOpDrive extends Command {
  public TeleOpDrive() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_driveSubsystem);
    requires(Robot.m_mastSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.m_driveSubsystem.drive(-Robot.m_oi.joystick.getY(), Robot.m_oi.joystick.getX());
    if (Robot.m_oi.joystick.getZ() != 0) {
      Robot.m_mastSubsystem.setMast(Robot.m_oi.joystick.getZ());
    }
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
