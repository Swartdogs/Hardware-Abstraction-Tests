package frc.robot.abstraction;

import java.util.Map;

import edu.wpi.first.wpilibj.shuffleboard.BuiltInLayouts;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;

public class MockShuffleboardLayout extends ShuffleboardLayout 
{
    @Override
    protected NetworkTableBoolean addBoolean(String networkTableId, boolean defaultValue, BuiltInWidgets widget, Map<String, Object> properties) 
    {
        return null;
    }

    @Override
    protected NetworkTableDouble addDouble(String networkTableId, double defaultValue, BuiltInWidgets widget, Map<String, Object> properties) 
    {
        return null;
    }

    @Override
    protected NetworkTableString addString(String networkTableId, String defaultValue, BuiltInWidgets widget, Map<String, Object> properties) 
    {
        return null;
    }
    
    @Override
    protected ShuffleboardLayout addLayout(String layoutName, BuiltInLayouts layout, int x, int y, Map<String, Object> properties)
    {
        return null;
    }
}
