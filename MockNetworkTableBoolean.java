package frc.robot.abstraction;

public class MockNetworkTableBoolean extends NetworkTableBoolean
{
    private boolean _value;

    public MockNetworkTableBoolean()
    {
        this(false);
    }

    public MockNetworkTableBoolean(boolean initialValue)
    {
        set(initialValue);
    }

    @Override
    protected boolean getRaw() 
    {
        return _value;
    }

    @Override
    public void set(boolean value) 
    {
        _value = value;
    }
}
