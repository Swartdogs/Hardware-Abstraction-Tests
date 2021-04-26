package frc.robot.abstraction;

public class MockJoystick extends Joystick
{
    private double   _x;
    private double   _y;
    private double   _z;
    private double   _throttle;
    private Switch[] _buttons;

    public MockJoystick()
    {
        this(12);
    }

    public MockJoystick(int buttonCount)
    {
        _x          = 0;
        _y          = 0;
        _z          = 0;
        _throttle   = 0;
        _buttons    = new MockSwitch[buttonCount];
    }

    public double getX() 
    {
        return _x;
    }

    public void setX(double x)
    {
        _x = x;
    }

    public double getY() 
    {
        return _y;
    }

    public void setY(double y)
    {
        _y = y;
    }

    public double getZ()
    {
        return _z;
    }

    public void setZ(double z)
    {
        _z = z;
    }

    public double getThrottle()
    {
        return _throttle;
    }

    public void getThrottle(double throttle)
    {
        _throttle = throttle;
    }

    public Switch getButton(int buttonNum) 
    {
        if (buttonNum < 1 || buttonNum > _buttons.length)
        {
            throw new IndexOutOfBoundsException(String.format("Button index %d doesn't exist on this joystick!", buttonNum));
        }

        return _buttons[buttonNum - 1];
    }
    
}
