package frc.robot.abstraction;

public class MockNetworkTableDouble extends NetworkTableDouble
{
    private double _value;

    public MockNetworkTableDouble()
    {
        this(0);
    }

    public MockNetworkTableDouble(double initialValue)
    {
        set(initialValue);
    }

    @Override
    protected double getRaw() 
    {
        return _value;
    }

    @Override
    public void set(double value) 
    {
        _value = value;
        cache();
    }
    
}
