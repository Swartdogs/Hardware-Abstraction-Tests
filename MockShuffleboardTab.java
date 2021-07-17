package frc.robot.abstraction;

import java.util.Map;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;

public class MockShuffleboardTab extends ShuffleboardTab 
{
    @Override
    protected NetworkTableBoolean addBoolean(String networkTableId, boolean defaultValue, int x, int y, int w, int h, BuiltInWidgets widget, Map<String, Object> properties) 
    {
        return null;
    }

    @Override
    protected NetworkTableDouble addDouble(String networkTableId, double defaultValue, int x, int y, int w, int h, BuiltInWidgets widget, Map<String, Object> properties) 
    {
        return null;
    }

    @Override
    protected NetworkTableString addString(String networkTableId, String defaultValue, int x, int y, int w, int h, BuiltInWidgets widget, Map<String, Object> properties) 
    {
        return null;
    }

    @Override
    protected ShuffleboardLayout addLayout(String layoutName, BuiltInLayouts layout, int x, int y, int w, int h, Map<String, Object> properties) 
    {
        return null;
    }

    @Override
    public void addAutonomousChooser(int x, int y, int w, int h, BuiltInWidgets widget)
    {

    }

    @Override
    public void addAutonomous(String name, SwartdogCommand autonomous)
    {

    }

    @Override
    public void addDefaultAutonomous(String name, SwartdogCommand autonomous)
    {

    }

    @Override
    public SwartdogCommand getSelectedAutonomous()
    {
        return null;
    }
}
