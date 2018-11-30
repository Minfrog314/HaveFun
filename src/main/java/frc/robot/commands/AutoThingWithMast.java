package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoThingWithMast extends CommandGroup {
    public AutoThingWithMast() {
        addParallel(new Mast(3, 1));
        addSequential(new DriveForwardSome(3, .6));
        //addSequential(new TurnAround(1.8));
        //addSequential(new DriveForwardSome(5, .6));

        }
        }
