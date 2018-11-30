package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class ThereAndBack extends CommandGroup {
    public ThereAndBack() {
        addSequential(new DriveForwardSome(6, .6));
        addSequential(new TurnAround(1.8));
        addSequential(new DriveForwardSome(5, .6));

    }
}
