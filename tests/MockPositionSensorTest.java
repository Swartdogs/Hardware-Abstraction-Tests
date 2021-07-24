package frc.robot.abstraction.tests;

import org.junit.Test;
import static org.junit.Assert.*;

import frc.robot.abstraction.MockPositionSensor;

public class MockPositionSensorTest 
{
    private static final double EPSILON = 1e-2;

    @Test
    public void testDefaultConstructor()
    {
        MockPositionSensor mockPositionSensor = new MockPositionSensor();
        
        assertEquals(0, mockPositionSensor.get(), EPSILON);
    }

    @Test
    public void testConstructor0()
    {
        MockPositionSensor mockPositionSensor = new MockPositionSensor(0);

        assertEquals(0, mockPositionSensor.get(), EPSILON);
    }

    @Test
    public void testConstructor17()
    {
        MockPositionSensor mockPositionSensor = new MockPositionSensor(17);

        assertEquals(17, mockPositionSensor.get(), EPSILON);
    }

    @Test
    public void testConstructorMinus105()
    {
        MockPositionSensor mockPositionSensor = new MockPositionSensor(-105);

        assertEquals(-105, mockPositionSensor.get(), EPSILON);
    }

    @Test
    public void testResetFrom0()
    {
        MockPositionSensor mockPositionSensor = new MockPositionSensor(0);

        assertEquals(0, mockPositionSensor.get(), EPSILON);

        mockPositionSensor.set(0);

        assertEquals(0, mockPositionSensor.get(), EPSILON);
    }

    @Test
    public void testResetFrom17()
    {
        MockPositionSensor mockPositionSensor = new MockPositionSensor(17);

        assertEquals(17, mockPositionSensor.get(), EPSILON);

        mockPositionSensor.set(0);

        assertEquals(0, mockPositionSensor.get(), EPSILON);
    }

    @Test
    public void testResetFromMinus105()
    {
        MockPositionSensor mockPositionSensor = new MockPositionSensor(-105);

        assertEquals(-105, mockPositionSensor.get(), EPSILON);

        mockPositionSensor.set(0);

        assertEquals(0, mockPositionSensor.get(), EPSILON);
    }

    @Test
    public void testIncrementBy0()
    {
        MockPositionSensor mockPositionSensor = new MockPositionSensor(0);

        assertEquals(0, mockPositionSensor.get(), EPSILON);

        mockPositionSensor.increment(0);

        assertEquals(0, mockPositionSensor.get(), EPSILON);
    }

    @Test
    public void testIncrementBy17()
    {
        MockPositionSensor mockPositionSensor = new MockPositionSensor(0);

        assertEquals(0, mockPositionSensor.get(), EPSILON);

        mockPositionSensor.increment(17);

        assertEquals(17, mockPositionSensor.get(), EPSILON);
    }

    @Test
    public void testIncrementByMinus105()
    {
        MockPositionSensor mockPositionSensor = new MockPositionSensor(0);

        assertEquals(0, mockPositionSensor.get(), EPSILON);

        mockPositionSensor.increment(-105);

        assertEquals(-105, mockPositionSensor.get(), EPSILON);
    }

    @Test
    public void testDecrementBy0()
    {
        MockPositionSensor mockPositionSensor = new MockPositionSensor(0);
        
        assertEquals(0, mockPositionSensor.get(), EPSILON);

        mockPositionSensor.decrement(0);

        assertEquals(0, mockPositionSensor.get(), EPSILON);
    }

    @Test
    public void testDecrementBy17()
    {
        MockPositionSensor mockPositionSensor = new MockPositionSensor(0);

        assertEquals(0, mockPositionSensor.get(), EPSILON);

        mockPositionSensor.decrement(17);

        assertEquals(-17, mockPositionSensor.get(), EPSILON);
    }

    @Test
    public void testDecrementByMinus105()
    {
        MockPositionSensor mockPositionSensor = new MockPositionSensor(0);

        assertEquals(0, mockPositionSensor.get(), EPSILON);

        mockPositionSensor.decrement(-105);

        assertEquals(105, mockPositionSensor.get(), EPSILON);
    }

    @Test
    public void testSetTo0()
    {
        MockPositionSensor mockPositionSensor = new MockPositionSensor(0);

        assertEquals(0, mockPositionSensor.get(), EPSILON);

        mockPositionSensor.set(0);

        assertEquals(0, mockPositionSensor.get(), EPSILON);
    }

    @Test
    public void testSetTo17()
    {
        MockPositionSensor mockPositionSensor = new MockPositionSensor(0);

        assertEquals(0, mockPositionSensor.get(), EPSILON);

        mockPositionSensor.set(17);

        assertEquals(17, mockPositionSensor.get(), EPSILON);
    }

    @Test
    public void testSetToMinus105()
    {
        MockPositionSensor mockPositionSensor = new MockPositionSensor(0);

        assertEquals(0, mockPositionSensor.get(), EPSILON);

        mockPositionSensor.set(-105);

        assertEquals(-105, mockPositionSensor.get(), EPSILON);
    }

    @Test
    public void testScalingFunction()
    {
        MockPositionSensor mockPositionSensor = new MockPositionSensor(0);

        mockPositionSensor.setScalingFunction(raw -> raw * 2);
        mockPositionSensor.set(4);

        assertEquals(8, mockPositionSensor.get(), EPSILON);
    }
}
