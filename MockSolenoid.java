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
        _state = initialState;
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
    public ExtendState getExtendState() 
    {
        return _state;
    }
}
