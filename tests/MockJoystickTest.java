package frc.robot.abstraction.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import frc.robot.abstraction.MockJoystick;
import frc.robot.abstraction.Switch;

public class MockJoystickTest 
{
    private static final double EPSILON = 1e-2;

    @Test
    public void testDefaultConstructor()
    {
        MockJoystick mockJoystick = new MockJoystick();
        double       xAxis        = mockJoystick.getX();
        double       yAxis        = mockJoystick.getY();
        double       zAxis        = mockJoystick.getZ();
        double       throttle     = mockJoystick.getThrottle();
        Switch       button12     = mockJoystick.getButton(12);

        assertEquals(xAxis,    mockJoystick.getX(), EPSILON);
        assertEquals(yAxis,    mockJoystick.getY(), EPSILON);
        assertEquals(zAxis,    mockJoystick.getZ(), EPSILON);
        assertEquals(throttle, mockJoystick.getThrottle(), EPSILON);
        assertEquals(button12, mockJoystick.getButton(12));        
    }

    @Test
    public void testConstructor4()
    {
        MockJoystick mockJoystick = new MockJoystick(4);
        double       xAxis        = mockJoystick.getX();
        double       yAxis        = mockJoystick.getY();
        double       zAxis        = mockJoystick.getZ();
        double       throttle     = mockJoystick.getThrottle();
        Switch       button4      = mockJoystick.getButton(4);

        assertEquals(xAxis,    mockJoystick.getX(), EPSILON);
        assertEquals(yAxis,    mockJoystick.getY(), EPSILON);
        assertEquals(zAxis,    mockJoystick.getZ(), EPSILON);
        assertEquals(throttle, mockJoystick.getThrottle(), EPSILON);
        assertEquals(button4,  mockJoystick.getButton(4));
    }

    @Test
    public void testButtonOutOfRangeLow()
    {
        MockJoystick mockJoystick = new MockJoystick(12);

        try
        {
            mockJoystick.getButton(-1);

            fail();
        }

        catch (IndexOutOfBoundsException e)
        {

        }
    }

    @Test
    public void testButtonOutOfRangeHight()
    {
        MockJoystick mockJoystick = new MockJoystick(12);

        try
        {
            mockJoystick.getButton(13);

            fail();
        }

        catch (IndexOutOfBoundsException e)
        {

        }
    }
}
