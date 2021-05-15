package frc.robot.abstraction.tests;

import org.junit.Test;
import static org.junit.Assert.*;

import frc.robot.abstraction.MockNetworkTableBoolean;

public class MockNetworkTableBooleanTest 
{
    @Test
    public void testDefaultConstructor()
    {
        MockNetworkTableBoolean mockNetworkTableBoolean = new MockNetworkTableBoolean();

        assertEquals(false, mockNetworkTableBoolean.get());
    }

    @Test
    public void testConstructorFalse()
    {
        MockNetworkTableBoolean mockNetworkTableBoolean = new MockNetworkTableBoolean(false);

        assertEquals(false, mockNetworkTableBoolean.get());
    }

    @Test
    public void testConstructorTrue()
    {
        MockNetworkTableBoolean mockNetworkTableBoolean = new MockNetworkTableBoolean(true);

        assertEquals(true, mockNetworkTableBoolean.get());
    }

    @Test
    public void testSetToFalse()
    {
        MockNetworkTableBoolean mockNetworkTableBoolean = new MockNetworkTableBoolean(true);

        assertEquals(true, mockNetworkTableBoolean.get());

        mockNetworkTableBoolean.set(false);

        assertEquals(false, mockNetworkTableBoolean.get());
    }

    @Test
    public void testSetToTrue()
    {
        MockNetworkTableBoolean mockNetworkTableBoolean = new MockNetworkTableBoolean(false);

        assertEquals(false, mockNetworkTableBoolean.get());

        mockNetworkTableBoolean.set(true);

        assertEquals(true, mockNetworkTableBoolean.get());
    }
}
