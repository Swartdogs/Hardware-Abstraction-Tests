package frc.robot.abstraction.tests;

import org.junit.Test;
import static org.junit.Assert.*;

import frc.robot.abstraction.MockVelocitySensor;

public class MockVelocitySensorTest 
{
    private static final double EPSILON = 1e-2;

    @Test
    public void testDefaultConstructor()
    {
        MockVelocitySensor mockVelocitySensor = new MockVelocitySensor();
        
        assertEquals(0, mockVelocitySensor.get(), EPSILON);
    }

    @Test
    public void testConstructor0()
    {
        MockVelocitySensor mockVelocitySensor = new MockVelocitySensor(0);

        assertEquals(0, mockVelocitySensor.get(), EPSILON);
    }

    @Test
    public void testConstructor17()
    {
        MockVelocitySensor mockVelocitySensor = new MockVelocitySensor(17);

        assertEquals(17, mockVelocitySensor.get(), EPSILON);
    }

    @Test
    public void testConstructorMinus105()
    {
        MockVelocitySensor mockVelocitySensor = new MockVelocitySensor(-105);

        assertEquals(-105, mockVelocitySensor.get(), EPSILON);
    }

    @Test
    public void testIncrementBy0()
    {
        MockVelocitySensor mockVelocitySensor = new MockVelocitySensor(0);

        assertEquals(0, mockVelocitySensor.get(), EPSILON);

        mockVelocitySensor.increment(0);

        assertEquals(0, mockVelocitySensor.get(), EPSILON);
    }

    @Test
    public void testIncrementBy17()
    {
        MockVelocitySensor mockVelocitySensor = new MockVelocitySensor(0);

        assertEquals(0, mockVelocitySensor.get(), EPSILON);

        mockVelocitySensor.increment(17);

        assertEquals(17, mockVelocitySensor.get(), EPSILON);
    }

    @Test
    public void testIncrementByMinus105()
    {
        MockVelocitySensor mockVelocitySensor = new MockVelocitySensor(0);

        assertEquals(0, mockVelocitySensor.get(), EPSILON);

        mockVelocitySensor.increment(-105);

        assertEquals(-105, mockVelocitySensor.get(), EPSILON);
    }

    @Test
    public void testDecrementBy0()
    {
        MockVelocitySensor mockVelocitySensor = new MockVelocitySensor(0);
        
        assertEquals(0, mockVelocitySensor.get(), EPSILON);

        mockVelocitySensor.decrement(0);

        assertEquals(0, mockVelocitySensor.get(), EPSILON);
    }

    @Test
    public void testDecrementBy17()
    {
        MockVelocitySensor mockVelocitySensor = new MockVelocitySensor(0);

        assertEquals(0, mockVelocitySensor.get(), EPSILON);

        mockVelocitySensor.decrement(17);

        assertEquals(-17, mockVelocitySensor.get(), EPSILON);
    }

    @Test
    public void testDecrementByMinus105()
    {
        MockVelocitySensor mockVelocitySensor = new MockVelocitySensor(0);

        assertEquals(0, mockVelocitySensor.get(), EPSILON);

        mockVelocitySensor.decrement(-105);

        assertEquals(105, mockVelocitySensor.get(), EPSILON);
    }

    @Test
    public void testSetTo0()
    {
        MockVelocitySensor mockVelocitySensor = new MockVelocitySensor(0);

        assertEquals(0, mockVelocitySensor.get(), EPSILON);

        mockVelocitySensor.set(0);

        assertEquals(0, mockVelocitySensor.get(), EPSILON);
    }

    @Test
    public void testSetTo17()
    {
        MockVelocitySensor mockVelocitySensor = new MockVelocitySensor(0);

        assertEquals(0, mockVelocitySensor.get(), EPSILON);

        mockVelocitySensor.set(17);

        assertEquals(17, mockVelocitySensor.get(), EPSILON);
    }

    @Test
    public void testSetToMinus105()
    {
        MockVelocitySensor mockVelocitySensor = new MockVelocitySensor(0);

        assertEquals(0, mockVelocitySensor.get(), EPSILON);

        mockVelocitySensor.set(-105);

        assertEquals(-105, mockVelocitySensor.get(), EPSILON);
    }
}
