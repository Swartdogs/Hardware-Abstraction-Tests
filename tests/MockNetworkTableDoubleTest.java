package frc.robot.abstraction.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import frc.robot.abstraction.MockNetworkTableDouble;

public class MockNetworkTableDoubleTest 
{
    private static final double EPSILON = 1e-2;

    @Test
    public void testDefaultConstructor()
    {
        MockNetworkTableDouble mockNetworkTableDouble = new MockNetworkTableDouble();

        assertEquals(0, mockNetworkTableDouble.get(), EPSILON);
    }

    @Test
    public void testConstructor0()
    {
        MockNetworkTableDouble mockNetworkTableDouble = new MockNetworkTableDouble(0);

        assertEquals(0, mockNetworkTableDouble.get(), EPSILON);
    }

    @Test
    public void testConstructor17()
    {
        MockNetworkTableDouble mockNetworkTableDouble = new MockNetworkTableDouble(17);

        assertEquals(17, mockNetworkTableDouble.get(), EPSILON);
    }

    @Test
    public void testConstructorMinus105()
    {
        MockNetworkTableDouble mockNetworkTableDouble = new MockNetworkTableDouble(-105);

        assertEquals(-105, mockNetworkTableDouble.get(), EPSILON);
    }

    @Test
    public void testSetTo0()
    {
        MockNetworkTableDouble mockNetworkTableDouble = new MockNetworkTableDouble(17);

        assertEquals(17, mockNetworkTableDouble.get(), EPSILON);

        mockNetworkTableDouble.set(0);

        assertEquals(0, mockNetworkTableDouble.get(), EPSILON);
    }

    @Test
    public void testSetTo17()
    {
        MockNetworkTableDouble mockNetworkTableDouble = new MockNetworkTableDouble(0);

        assertEquals(0, mockNetworkTableDouble.get(), EPSILON);

        mockNetworkTableDouble.set(17);

        assertEquals(17, mockNetworkTableDouble.get(), EPSILON);
    }

    @Test
    public void testSetToMinus105()
    {
        MockNetworkTableDouble mockNetworkTableDouble = new MockNetworkTableDouble(0);

        assertEquals(0, mockNetworkTableDouble.get(), EPSILON);

        mockNetworkTableDouble.set(-105);

        assertEquals(-105, mockNetworkTableDouble.get(), EPSILON);
    }
}
