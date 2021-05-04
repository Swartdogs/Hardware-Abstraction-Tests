package frc.robot.abstraction;

import edu.wpi.first.wpilibj2.command.Command;
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
        _state = initialState;
    }

    @Override
    public State get() 
    {
        return _state;
    }

    public void setState(State state) 
    {
        _state = state;
    }

    @Override
    public void whenActivated(Command command) 
    {

    }

    @Override
    public void whileActive(Command command) 
    {

    }

    @Override
    public void cancelWhenActivated(Command command) 
    {

    }
}
