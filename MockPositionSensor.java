package frc.robot.abstraction;

public class MockPositionSensor extends PositionSensor
{
    private double _position;

    public MockPositionSensor()
    {
        this(0);
    }

    public MockPositionSensor(double initialPosition)
    {
        set(initialPosition);
    }

    @Override
    public double getRaw() 
    {
        return _position;
    }

    @Override
    public void reset() 
    {
        set(0);
    }
    
    public void increment(double amount)
    {
        set(_position + amount);
    }

    public void decrement(double amount)
    {
        set(_position - amount);
    }

    public void set(double position)
    {
        _position = position;
        cache();
    }
}
