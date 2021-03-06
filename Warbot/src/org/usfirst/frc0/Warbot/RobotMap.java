// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.
package org.usfirst.frc0.Warbot;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder.PIDSourceParameter;
import edu.wpi.first.wpilibj.can.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import java.util.Vector;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static Gyro chassisrotateGyro;
    public static SpeedController chassisrotatePLACEHOLDER;
    public static SpeedController chassisSpeedController2;
    public static SpeedController chassisSpeedController1;
    public static RobotDrive chassisRobotDrive;
    public static AnalogChannel chassisLeftUltrasonic;
    public static AnalogChannel chassisRightUltrasonic;
    public static Encoder chassisLeftEncoder;
    public static Encoder chassisRightEncoder;
    public static SpeedController elevatorMotor;
    public static AnalogChannel elevatorPot;
    public static SpeedController shooterkickermotor;
    public static SpeedController shooterMotor1;
    public static SpeedController shooterMotor2;
    public static SpeedController shooterMotor3;
    public static SpeedController pickupBeltMotor;
    public static SpeedController pickupShaftMotor;
    public static SpeedController climberMotor;
    public static DigitalInput climberLimit;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public static void init() {
        
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        chassisrotateGyro = new Gyro(1, 1);
	LiveWindow.addSensor("Chassis rotate", "Gyro", chassisrotateGyro);
        chassisrotateGyro.setSensitivity(0.007);
        chassisrotatePLACEHOLDER = new Victor(2, 1);
	//LiveWindow.addActuator("Chassis rotate", "PLACEHOLDER", (Victor) chassisrotatePLACEHOLDER);
        
        chassisSpeedController2 = new Jaguar(1, 2);
	LiveWindow.addActuator("Chassis", "Speed Controller 2", (Jaguar) chassisSpeedController2);
        
        chassisSpeedController1 = new Jaguar(1, 1);
	LiveWindow.addActuator("Chassis", "Speed Controller 1", (Jaguar) chassisSpeedController1);
        
        chassisRobotDrive = new RobotDrive(chassisSpeedController1, chassisSpeedController2);
	
        chassisRobotDrive.setSafetyEnabled(true);
        chassisRobotDrive.setExpiration(0.1);
        chassisRobotDrive.setSensitivity(0.5);
        chassisRobotDrive.setMaxOutput(1.0);
        
        chassisLeftUltrasonic = new AnalogChannel(1, 2);
	LiveWindow.addSensor("Chassis", "Left Ultrasonic", chassisLeftUltrasonic);
        
        chassisRightUltrasonic = new AnalogChannel(1, 3);
	LiveWindow.addSensor("Chassis", "Right Ultrasonic", chassisRightUltrasonic);
        
        chassisLeftEncoder = new Encoder(1, 1, 1, 2, false, EncodingType.k4X);
	LiveWindow.addSensor("Chassis", "LeftEncoder", chassisLeftEncoder);
        chassisLeftEncoder.setDistancePerPulse(0.04177);
        chassisLeftEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        chassisLeftEncoder.start();
        chassisRightEncoder = new Encoder(1, 3, 1, 4, false, EncodingType.k4X);
	LiveWindow.addSensor("Chassis", "RightEncoder", chassisRightEncoder);
        chassisRightEncoder.setDistancePerPulse(0.04177);
        chassisRightEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        chassisRightEncoder.start();
        elevatorMotor = new Jaguar(1, 10);
	LiveWindow.addActuator("Elevator", "Motor", (Jaguar) elevatorMotor);
        
        elevatorPot = new AnalogChannel(1, 4);
	LiveWindow.addSensor("Elevator", "Pot", elevatorPot);
        
        shooterkickermotor = new Victor(1, 6);
	LiveWindow.addActuator("Shooter", "kicker motor", (Victor) shooterkickermotor);
        
        shooterMotor1 = new Victor(1, 5);
	LiveWindow.addActuator("Shooter", "Motor 1", (Victor) shooterMotor1);
        
        shooterMotor2 = new Victor(1, 7);
	LiveWindow.addActuator("Shooter", "Motor 2", (Victor) shooterMotor2);
        
        shooterMotor3 = new Victor(1, 8);
	LiveWindow.addActuator("Shooter", "Motor 3", (Victor) shooterMotor3);
        
        pickupBeltMotor = new Jaguar(1, 4);
	LiveWindow.addActuator("Pickup Belt", "Motor", (Jaguar) pickupBeltMotor);
        
        pickupShaftMotor = new Jaguar(1, 3);
	LiveWindow.addActuator("Pickup Shaft", "Motor", (Jaguar) pickupShaftMotor);
        
        climberMotor = new Jaguar(1, 9);
	LiveWindow.addActuator("Climber", "Motor", (Jaguar) climberMotor);
        
        climberLimit = new DigitalInput(1, 5);
	LiveWindow.addSensor("Climber", "Limit", climberLimit);
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
