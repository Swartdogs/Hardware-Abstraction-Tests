package frc.robot.abstraction.tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import frc.robot.abstraction.MockMotor;
import frc.robot.abstraction.Motor;
import frc.robot.abstraction.PositionSensor;
import frc.robot.abstraction.VelocitySensor;

public class MockMotorTest 
{
    private static final double EPSILON = 1e-2;

    private MockMotor _mockMotor1;
    private MockMotor _mockMotor2;

    @Before
    public void initialize()
    {
        _mockMotor1 = new MockMotor();
        _mockMotor2 = new MockMotor();
    }

    @Test
    public void testDefaultConstructor()
    {
        assertEquals(0, _mockMotor1.get(), EPSILON);
    }

    @Test
    public void testSetTo0()
    {
        _mockMotor1.set(0);

        assertEquals(0, _mockMotor1.get(), EPSILON);
    }

    @Test
    public void testSetTo17()
    {
        _mockMotor1.set(17);

        assertEquals(17, _mockMotor1.get(), EPSILON);
    }

    @Test
    public void testSetToMinus105()
    {
        _mockMotor1.set(-105);

        assertEquals(-105, _mockMotor1.get(), EPSILON);
    }

    @Test
    public void testGetPositionSensor()
    {
        PositionSensor positionSensor = _mockMotor1.getPositionSensor();

        assertEquals(positionSensor, _mockMotor1.getPositionSensor());
    }

    @Test
    public void testGetVelocitySensor()
    {
        VelocitySensor velocitySensor = _mockMotor1.getVelocitySensor();

        assertEquals(velocitySensor, _mockMotor1.getVelocitySensor());
    }

    @Test
    public void testSetTo0Inverted()
    {
        Motor motor = Motor.invert(_mockMotor1);

        motor.set(0);

        assertEquals(0, _mockMotor1.get(), EPSILON);
    }

    @Test
    public void testSetTo17Inverted()
    {
        Motor motor = Motor.invert(_mockMotor1);

        motor.set(17);

        assertEquals(-17, _mockMotor1.get(), EPSILON);
    }

    @Test
    public void testSetToMinus105Inverted()
    {
        Motor motor = Motor.invert(_mockMotor1);

        motor.set(-105);

        assertEquals(105, _mockMotor1.get(), EPSILON);
    }

    @Test
    public void testGetPositionSensorInverted()
    {
        PositionSensor positionSensor = _mockMotor1.getPositionSensor();
        Motor          motor          = Motor.invert(_mockMotor1);

        assertEquals(positionSensor, motor.getPositionSensor());
    }

    @Test
    public void testGetVelocitySensorInverted()
    {
        VelocitySensor velocitySensor = _mockMotor1.getVelocitySensor();
        Motor          motor          = Motor.invert(_mockMotor1);

        assertEquals(velocitySensor, motor.getVelocitySensor());
    }

    @Test
    public void testSetTo0Composed()
    {
        Motor motor = Motor.compose(_mockMotor1, _mockMotor2);

        motor.set(0);

        assertEquals(0, _mockMotor1.get(), EPSILON);
        assertEquals(0, _mockMotor2.get(), EPSILON);
    }

    @Test
    public void testSetTo17Composed()
    {
        Motor motor = Motor.compose(_mockMotor1, _mockMotor2);

        motor.set(17);

        assertEquals(17, _mockMotor1.get(), EPSILON);
        assertEquals(17, _mockMotor2.get(), EPSILON);
    }

    @Test
    public void testSetToMinus105Composed()
    {
        Motor motor = Motor.compose(_mockMotor1, _mockMotor2);

        motor.set(-105);

        assertEquals(-105, _mockMotor1.get(), EPSILON);
        assertEquals(-105, _mockMotor2.get(), EPSILON);
    }

    @Test
    public void testGetPositionSensorComposed()
    {
        PositionSensor positionSensor = _mockMotor1.getPositionSensor();
        Motor          motor          = Motor.compose(_mockMotor1, _mockMotor2);

        assertEquals(positionSensor, motor.getPositionSensor());
    }

    @Test
    public void testGetVelocitySensorComposed()
    {
        VelocitySensor velocitySensor = _mockMotor1.getVelocitySensor();
        Motor          motor          = Motor.compose(_mockMotor1, _mockMotor2);

        assertEquals(velocitySensor, motor.getVelocitySensor());
    }

    @Test
    public void testSetTo0Complex()
    {
        Motor motor = Motor.compose(_mockMotor1, Motor.invert(_mockMotor2));

        motor.set(0);

        assertEquals(0, _mockMotor1.get(), EPSILON);
        assertEquals(0, _mockMotor2.get(), EPSILON);
    }

    @Test
    public void testSetTo17Complex()
    {
        Motor motor = Motor.compose(_mockMotor1, Motor.invert(_mockMotor2));

        motor.set(17);

        assertEquals( 17, _mockMotor1.get(), EPSILON);
        assertEquals(-17, _mockMotor2.get(), EPSILON);
    }

    @Test
    public void testSetToMinus105Complex()
    {
        Motor motor = Motor.compose(_mockMotor1, Motor.invert(_mockMotor2));

        motor.set(-105);

        assertEquals(-105, _mockMotor1.get(), EPSILON);
        assertEquals( 105, _mockMotor2.get(), EPSILON);
    }

    @Test
    public void testGetPositionSensorComplex()
    {
        PositionSensor positionSensor = _mockMotor1.getPositionSensor();
        Motor          motor          = Motor.compose(_mockMotor1, Motor.invert(_mockMotor2));

        assertEquals(positionSensor, motor.getPositionSensor());
    }

    @Test
    public void testGetVelocitySensorComplex()
    {
        VelocitySensor velocitySensor = _mockMotor1.getVelocitySensor();
        Motor          motor          = Motor.compose(_mockMotor1, Motor.invert(_mockMotor2));

        assertEquals(velocitySensor, motor.getVelocitySensor());
    }
}
