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
        _velocity = initialVelocity;
    }

    @Override
    public double getRawVelocity() 
    {
        return _velocity;
    }
    
    public void increment(double amount)
    {
        _velocity += amount;
    }

    public void decrement(double amount)
    {
        _velocity -= amount;
    }

    public void set(double velocity)
    {
        _velocity = velocity;
    }
}
