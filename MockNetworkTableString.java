package frc.robot.abstraction;

public class MockNetworkTableString extends NetworkTableString
{
    private String _value;

    public MockNetworkTableString()
    {
        this("");
    }

    public MockNetworkTableString(String initialValue)
    {
        set(initialValue);
    }

    @Override
    protected String getRaw() 
    {
        return _value;
    }

    @Override
    public void set(String value) 
    {
        _value = value;
        cache();
    }
}
