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

        assertEquals(State.Off, mockSwitch.getState());
    }

    @Test
    public void testConstrcutorOff()
    {
        MockSwitch mockSwitch = new MockSwitch(State.Off);

        assertEquals(State.Off, mockSwitch.getState());
    }

    @Test
    public void testConstructorOn()
    {
        MockSwitch mockSwitch = new MockSwitch(State.On);

        assertEquals(State.On, mockSwitch.getState());
    }

    @Test
    public void testSetStateOff()
    {
        MockSwitch mockSwitch = new MockSwitch(State.On);

        assertEquals(State.On, mockSwitch.getState());

        mockSwitch.setState(State.Off);

        assertEquals(State.Off, mockSwitch.getState());
    }

    @Test
    public void testSetStateOn()
    {
        MockSwitch mockSwitch = new MockSwitch(State.Off);

        assertEquals(State.Off, mockSwitch.getState());

        mockSwitch.setState(State.On);

        assertEquals(State.On, mockSwitch.getState());
    }
}
