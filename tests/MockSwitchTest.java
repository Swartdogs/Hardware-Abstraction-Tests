package frc.robot.abstraction.tests;

import org.junit.Test;
import static org.junit.Assert.*;

import frc.robot.abstraction.MockSwitch;
import frc.robot.abstraction.Enumerations.State;

public class MockSwitchTest 
{
    @Test
    public void testDefaultConstructor()
    {
        MockSwitch mockSwitch = new MockSwitch();

        assertEquals(State.Off, mockSwitch.get());
    }

    @Test
    public void testConstrcutorOff()
    {
        MockSwitch mockSwitch = new MockSwitch(State.Off);

        assertEquals(State.Off, mockSwitch.get());
    }

    @Test
    public void testConstructorOn()
    {
        MockSwitch mockSwitch = new MockSwitch(State.On);

        assertEquals(State.On, mockSwitch.get());
    }

    @Test
    public void testSetStateOff()
    {
        MockSwitch mockSwitch = new MockSwitch(State.On);

        assertEquals(State.On, mockSwitch.get());

        mockSwitch.set(State.Off);

        assertEquals(State.Off, mockSwitch.get());
    }

    @Test
    public void testSetStateOn()
    {
        MockSwitch mockSwitch = new MockSwitch(State.Off);

        assertEquals(State.Off, mockSwitch.get());

        mockSwitch.set(State.On);

        assertEquals(State.On, mockSwitch.get());
    }

    @Test
    public void testTransitionToOff()
    {
        MockSwitch mockSwitch = new MockSwitch(State.On);

        assertFalse(mockSwitch.transitionedTo(State.Off));

        mockSwitch.set(State.Off);

        assertTrue(mockSwitch.transitionedTo(State.Off));
    }

    @Test
    public void testTransitionToOn()
    {
        MockSwitch mockSwitch = new MockSwitch(State.Off);

        assertFalse(mockSwitch.transitionedTo(State.On));

        mockSwitch.set(State.On);

        assertTrue(mockSwitch.transitionedTo(State.On));
    }

    @Test
    public void testTransitionToReverse()
    {
        MockSwitch mockSwitch = new MockSwitch(State.Off);

        assertFalse(mockSwitch.transitionedTo(State.Reverse));

        mockSwitch.set(State.Reverse);

        assertTrue(mockSwitch.transitionedTo(State.Reverse));
    }
}
