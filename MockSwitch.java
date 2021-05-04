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
        set(initialState);
    }

    @Override
    protected State getRaw() 
    {
        return _state;
    }

    public void set(State state) 
    {
        _state = state;
        cache();
    }

    @Override
    public void whenActivated(Command command) 
    {
        return;
    }

    @Override
    public void whileActive(Command command) 
    {
        return;
    }

    @Override
    public void cancelWhenActivated(Command command) 
    {
        return;
    }
}
