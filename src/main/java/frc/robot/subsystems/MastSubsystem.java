/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.TeleOpDrive;


/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class MastSubsystem extends Subsystem {

  Talon mast = new Talon(3);


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new TeleOpDrive());

  }

  public void setMast(double speed) {
    mast.set(speed);
  }

}
