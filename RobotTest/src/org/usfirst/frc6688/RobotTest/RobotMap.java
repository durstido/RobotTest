// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc6688.RobotTest;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainfrontRight;
    public static SpeedController driveTrainfrontLeft;
    public static SpeedController driveTrainrearRight;
    public static SpeedController driveTrainrearLeft;
    public static RobotDrive driveTrainRobotDrive41;
    public static SpeedController doorfrontMotorRight;
    public static SpeedController doorfrontMotorLeft;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainfrontRight = new Spark(2);
        LiveWindow.addActuator("DriveTrain", "frontRight", (Spark) driveTrainfrontRight);
        
        driveTrainfrontLeft = new Spark(1);
        LiveWindow.addActuator("DriveTrain", "frontLeft", (Spark) driveTrainfrontLeft);
        
        driveTrainrearRight = new Spark(3);
        LiveWindow.addActuator("DriveTrain", "rearRight", (Spark) driveTrainrearRight);
        
        driveTrainrearLeft = new Spark(0);
        LiveWindow.addActuator("DriveTrain", "rearLeft", (Spark) driveTrainrearLeft);
        
        driveTrainRobotDrive41 = new RobotDrive(driveTrainfrontLeft, driveTrainrearLeft,
              driveTrainfrontRight, driveTrainrearRight);
        
        driveTrainRobotDrive41.setSafetyEnabled(false);
        driveTrainRobotDrive41.setExpiration(0.1);
        driveTrainRobotDrive41.setSensitivity(0.5);
        driveTrainRobotDrive41.setMaxOutput(1.0);

        doorfrontMotorRight = new Talon(4);
        LiveWindow.addActuator("Door", "frontMotorRight", (Talon) doorfrontMotorRight);
        
        doorfrontMotorLeft = new Talon(5);
        LiveWindow.addActuator("Door", "frontMotorLeft", (Talon) doorfrontMotorLeft);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
