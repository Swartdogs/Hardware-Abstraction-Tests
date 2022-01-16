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
    }

    @Override
    public void extend() 
    {
        _state = ExtendState.Extended;
    }

    @Override
    public void retract() 
    {
        _state = ExtendState.Retracted;
    }

    @Override
    public ExtendState get() 
    {
        return _state;
    }
}
