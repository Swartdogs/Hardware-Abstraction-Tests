package frc.robot.abstraction;

import frc.robot.abstraction.Enumerations.State;

public class MockSwitch extends Switch 
{
    private State _state;

    public MockSwitch() 
    {
        this(State.Off);
    }

    public MockSwitch(State initialState) 
    {
        set(initialState);
    }

    @Override
    public State get() 
    {
        return _state;
    }

    public void set(State state) 
    {
        _state = state;
    }
}
