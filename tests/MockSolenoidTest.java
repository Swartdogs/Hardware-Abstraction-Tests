package frc.robot.abstraction.tests;

import org.junit.Test;
import static org.junit.Assert.*;

import frc.robot.abstraction.MockSolenoid;
import frc.robot.abstraction.Solenoid;
import frc.robot.abstraction.Enumerations.ExtendState;

public class MockSolenoidTest 
{
    @Test
    public void testDefaultConstructor()
    {
        MockSolenoid mockSolenoid = new MockSolenoid();

        assertEquals(ExtendState.Retracted, mockSolenoid.getExtendState());
    }

    @Test
    public void testConstructorRetracted()
    {
        MockSolenoid mockSolenoid = new MockSolenoid(ExtendState.Retracted);

        assertEquals(ExtendState.Retracted, mockSolenoid.getExtendState());
    }

    @Test
    public void testConstructorExtended()
    {
        MockSolenoid mockSolenoid = new MockSolenoid(ExtendState.Extended);

        assertEquals(ExtendState.Extended, mockSolenoid.getExtendState());
    }

    @Test
    public void testExtend()
    {
        MockSolenoid mockSolenoid = new MockSolenoid(ExtendState.Retracted);

        assertEquals(ExtendState.Retracted, mockSolenoid.getExtendState());

        mockSolenoid.extend();

        assertEquals(ExtendState.Extended, mockSolenoid.getExtendState());
    }

    @Test
    public void testRetract()
    {
        MockSolenoid mockSolenoid = new MockSolenoid(ExtendState.Extended);

        assertEquals(ExtendState.Extended, mockSolenoid.getExtendState());

        mockSolenoid.retract();

        assertEquals(ExtendState.Retracted, mockSolenoid.getExtendState());
    }

    @Test
    public void testDefaultConstructorInverted()
    {
        Solenoid solenoid = Solenoid.invert(new MockSolenoid());

        assertEquals(ExtendState.Extended, solenoid.getExtendState());
    }

    @Test
    public void testConstructorRetractedInverted()
    {
        Solenoid solenoid = Solenoid.invert(new MockSolenoid(ExtendState.Retracted));

        assertEquals(ExtendState.Extended, solenoid.getExtendState());
    }

    @Test
    public void testConstructorExtendedInverted()
    {
        Solenoid solenoid = Solenoid.invert(new MockSolenoid(ExtendState.Extended));

        assertEquals(ExtendState.Retracted, solenoid.getExtendState());
    }

    @Test
    public void testExtendInverted()
    {
        MockSolenoid mockSolenoid = new MockSolenoid(ExtendState.Extended);
        Solenoid     solenoid     = Solenoid.invert(mockSolenoid);

        assertEquals(ExtendState.Extended, mockSolenoid.getExtendState());

        solenoid.extend();

        assertEquals(ExtendState.Retracted, mockSolenoid.getExtendState());
    }

    @Test
    public void testRetractInverted()
    {
        MockSolenoid mockSolenoid = new MockSolenoid(ExtendState.Retracted);
        Solenoid     solenoid     = Solenoid.invert(mockSolenoid);

        assertEquals(ExtendState.Retracted, mockSolenoid.getExtendState());

        solenoid.retract();

        assertEquals(ExtendState.Extended, mockSolenoid.getExtendState());
    }

    @Test
    public void testExtendComposed()
    {
        MockSolenoid solenoid1 = new MockSolenoid(ExtendState.Retracted);
        MockSolenoid solenoid2 = new MockSolenoid(ExtendState.Retracted);
        Solenoid     solenoid  = Solenoid.compose(solenoid1, solenoid2);

        assertEquals(ExtendState.Retracted, solenoid1.getExtendState());
        assertEquals(ExtendState.Retracted, solenoid2.getExtendState());

        solenoid.extend();

        assertEquals(ExtendState.Extended, solenoid1.getExtendState());
        assertEquals(ExtendState.Extended, solenoid2.getExtendState());
    }

    @Test
    public void testRetractComposed()
    {
        MockSolenoid solenoid1 = new MockSolenoid(ExtendState.Extended);
        MockSolenoid solenoid2 = new MockSolenoid(ExtendState.Extended);
        Solenoid     solenoid  = Solenoid.compose(solenoid1, solenoid2);

        assertEquals(ExtendState.Extended, solenoid1.getExtendState());
        assertEquals(ExtendState.Extended, solenoid2.getExtendState());

        solenoid.retract();

        assertEquals(ExtendState.Retracted, solenoid1.getExtendState());
        assertEquals(ExtendState.Retracted, solenoid2.getExtendState());
    }

    @Test
    public void testExtendComplex()
    {
        MockSolenoid solenoid1 = new MockSolenoid(ExtendState.Retracted);
        MockSolenoid solenoid2 = new MockSolenoid(ExtendState.Extended);
        Solenoid     solenoid  = Solenoid.compose(solenoid1, Solenoid.invert(solenoid2));

        assertEquals(ExtendState.Retracted, solenoid1.getExtendState());
        assertEquals(ExtendState.Extended,  solenoid2.getExtendState());

        solenoid.extend();

        assertEquals(ExtendState.Extended,  solenoid1.getExtendState());
        assertEquals(ExtendState.Retracted, solenoid2.getExtendState());
    }

    @Test
    public void testRetractComplex()
    {
        MockSolenoid solenoid1 = new MockSolenoid(ExtendState.Extended);
        MockSolenoid solenoid2 = new MockSolenoid(ExtendState.Retracted);
        Solenoid     solenoid  = Solenoid.compose(solenoid1, Solenoid.invert(solenoid2));

        assertEquals(ExtendState.Extended,  solenoid1.getExtendState());
        assertEquals(ExtendState.Retracted, solenoid2.getExtendState());

        solenoid.retract();

        assertEquals(ExtendState.Retracted, solenoid1.getExtendState());
        assertEquals(ExtendState.Extended,  solenoid2.getExtendState());
    }
}
