package frc.robot.abstraction.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import frc.robot.abstraction.MockNetworkTableString;

public class MockNetworkTableStringTest 
{
    @Test
    public void testDefaultConstructor()
    {
        MockNetworkTableString mockNetworkTableString = new MockNetworkTableString();

        assertEquals("", mockNetworkTableString.get());
    }

    @Test
    public void testConstructorHello()
    {
        MockNetworkTableString mockNetworkTableString = new MockNetworkTableString("Hello");

        assertEquals("Hello", mockNetworkTableString.get());
    }

    @Test
    public void testConstructorSwartdogs()
    {
        MockNetworkTableString mockNetworkTableString = new MockNetworkTableString("Swartdogs");

        assertEquals("Swartdogs", mockNetworkTableString.get());
    }

    @Test
    public void testConstructorFIRST()
    {
        MockNetworkTableString mockNetworkTableString = new MockNetworkTableString("FIRST");

        assertEquals("FIRST", mockNetworkTableString.get());
    }

    @Test
    public void testSetHello()
    {
        MockNetworkTableString mockNetworkTableString = new MockNetworkTableString("");

        assertEquals("", mockNetworkTableString.get());

        mockNetworkTableString.set("Hello");

        assertEquals("Hello", mockNetworkTableString.get());
    }

    @Test
    public void testSetSwartdogs()
    {
        MockNetworkTableString mockNetworkTableString = new MockNetworkTableString("");

        assertEquals("", mockNetworkTableString.get());

        mockNetworkTableString.set("Swartdogs");

        assertEquals("Swartdogs", mockNetworkTableString.get());
    }

    @Test
    public void testSetFIRST()
    {
        MockNetworkTableString mockNetworkTableString = new MockNetworkTableString("");

        assertEquals("", mockNetworkTableString.get());

        mockNetworkTableString.set("FIRST");

        assertEquals("FIRST", mockNetworkTableString.get());
    }
}
