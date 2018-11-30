/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.TeleOpDrive;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveSubsystem extends Subsystem {

  WPI_TalonSRX frontRight = new WPI_TalonSRX(0);
  WPI_TalonSRX frontLeft = new WPI_TalonSRX(1);
  WPI_TalonSRX backRight = new WPI_TalonSRX(2);
  WPI_TalonSRX backLeft = new WPI_TalonSRX(3);
  SpeedControllerGroup right = new SpeedControllerGroup(frontRight, backRight);
  SpeedControllerGroup left = new SpeedControllerGroup(backLeft, frontLeft);
  private DifferentialDrive drive = new DifferentialDrive(left, right);


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
      setDefaultCommand(new TeleOpDrive());
  }

  public void drive( double xInput, double zRotaion) {
      drive.arcadeDrive(xInput, zRotaion);
  }
}
