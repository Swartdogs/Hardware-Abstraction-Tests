package frc.robot.abstraction;

import frc.robot.abstraction.Enumerations.ExtendState;

public class MockSolenoid extends Solenoid 
{
    private ExtendState _state;

    public MockSolenoid()
    {
        this(ExtendState.Retracted);
    }

    public MockSolenoid(ExtendState initialState)
    {
        set(initialState);
    }

    @Override
    public void set(ExtendState state)
    {
        _state = state;
        cache();
    }

    @Override
    public void extend() 
    {
        _state = ExtendState.Extended;
        cache();
    }

    @Override
    public void retract() 
    {
        _state = ExtendState.Retracted;
        cache();
    }

    @Override
    protected ExtendState getRaw() 
    {
        return _state;
    }
}
