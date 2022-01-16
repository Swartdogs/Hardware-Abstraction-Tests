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
    public double get() 
    {
        return _scalingFunction.applyAsDouble(_position);
    }

    @Override
    public void set(double newPosition)
    {
        _position = newPosition;
    }
    
    public void increment(double amount)
    {
        set(_position + amount);
    }

    public void decrement(double amount)
    {
        set(_position - amount);
    }
}
