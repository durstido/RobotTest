package org.usfirst.frc6688.RobotTest.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc6688.RobotTest.Robot;

/**
 *
 */
public class turnRight extends Command {


    public turnRight() {

        requires(Robot.driveTrain);

        double incrementRunTime = Robot.driveTrain.timeRunForward;
        setTimeout(incrementRunTime);
    }

    protected void initialize() {
    	Robot.driveTrain.turnRight();
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
