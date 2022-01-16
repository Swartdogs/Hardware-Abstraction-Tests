package frc.robot.abstraction;

public class MockVelocitySensor extends VelocitySensor
{
    private double _velocity;

    public MockVelocitySensor()
    {
        this(0);
    }

    public MockVelocitySensor(double initialVelocity)
    {
        set(initialVelocity);
    }

    @Override
    public double get() 
    {
        return _velocity;
    }
    
    public void increment(double amount)
    {
        set(_velocity + amount);
    }

    public void decrement(double amount)
    {
        set(_velocity - amount);
    }

    public void set(double velocity)
    {
        _velocity = velocity;
    }
}
