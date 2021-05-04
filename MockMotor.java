package frc.robot.abstraction;

public class MockMotor extends Motor
{
    private double          _speed;
    private PositionSensor  _positionSensor;
    private VelocitySensor  _velocitySensor;

    public MockMotor()
    {
        _speed          = 0;
        _positionSensor = new MockPositionSensor();
        _velocitySensor = new MockVelocitySensor();
    }

    @Override
    protected double getRaw() 
    {
        return _speed;
    }

    @Override
    public PositionSensor getPositionSensor() 
    {
        return _positionSensor;
    }

    @Override
    public VelocitySensor getVelocitySensor() 
    {
        return _velocitySensor;
    }

    @Override
    public void set(double speed) 
    {
        _speed = speed;
        cache();
    }
}
