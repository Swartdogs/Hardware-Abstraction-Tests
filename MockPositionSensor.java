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
        _position = initialPosition;
    }

    @Override
    public double getRaw() 
    {
        return _position;
    }

    @Override
    public void reset() 
    {
        _position = 0;
    }
    
    public void increment(double amount)
    {
        _position += amount;
    }

    public void decrement(double amount)
    {
        _position -= amount;
    }

    public void set(double position)
    {
        _position = position;
    }
}
