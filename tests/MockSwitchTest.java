package frc.robot.abstraction.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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
}
