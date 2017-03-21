package org.usfirst.frc6688.RobotTest.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc6688.RobotTest.Robot;

/**
 *
 */
public class turnLeft extends Command {


    public turnLeft() {

        requires(Robot.driveTrain);

        double incrementRunTime = Robot.driveTrain.timeRunForward;
        setTimeout(incrementRunTime);
    }

    protected void initialize() {
    	Robot.driveTrain.turnLeft();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
    	Robot.driveTrain.stop();
    }

    protected void interrupted() {
    	end();
    }
}
