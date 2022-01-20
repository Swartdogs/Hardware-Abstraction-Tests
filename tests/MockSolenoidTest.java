package frc.robot.abstraction.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import frc.robot.abstraction.MockSolenoid;
import frc.robot.abstraction.Solenoid;
import frc.robot.abstraction.Enumerations.ExtendState;

public class MockSolenoidTest 
{
    @Test
    public void testDefaultConstructor()
    {
        MockSolenoid mockSolenoid = new MockSolenoid();

        assertEquals(ExtendState.Retracted, mockSolenoid.get());
    }

    @Test
    public void testConstructorRetracted()
    {
        MockSolenoid mockSolenoid = new MockSolenoid(ExtendState.Retracted);

        assertEquals(ExtendState.Retracted, mockSolenoid.get());
    }

    @Test
    public void testConstructorExtended()
    {
        MockSolenoid mockSolenoid = new MockSolenoid(ExtendState.Extended);

        assertEquals(ExtendState.Extended, mockSolenoid.get());
    }

    @Test
    public void testExtend()
    {
        MockSolenoid mockSolenoid = new MockSolenoid(ExtendState.Retracted);

        assertEquals(ExtendState.Retracted, mockSolenoid.get());

        mockSolenoid.extend();

        assertEquals(ExtendState.Extended, mockSolenoid.get());
    }

    @Test
    public void testRetract()
    {
        MockSolenoid mockSolenoid = new MockSolenoid(ExtendState.Extended);

        assertEquals(ExtendState.Extended, mockSolenoid.get());

        mockSolenoid.retract();

        assertEquals(ExtendState.Retracted, mockSolenoid.get());
    }

    @Test
    public void testDefaultConstructorInverted()
    {
        Solenoid solenoid = Solenoid.invert(new MockSolenoid());

        assertEquals(ExtendState.Extended, solenoid.get());
    }

    @Test
    public void testConstructorRetractedInverted()
    {
        Solenoid solenoid = Solenoid.invert(new MockSolenoid(ExtendState.Retracted));

        assertEquals(ExtendState.Extended, solenoid.get());
    }

    @Test
    public void testConstructorExtendedInverted()
    {
        Solenoid solenoid = Solenoid.invert(new MockSolenoid(ExtendState.Extended));

        assertEquals(ExtendState.Retracted, solenoid.get());
    }

    @Test
    public void testExtendInverted()
    {
        MockSolenoid mockSolenoid = new MockSolenoid(ExtendState.Extended);
        Solenoid     solenoid     = Solenoid.invert(mockSolenoid);

        assertEquals(ExtendState.Extended, mockSolenoid.get());

        solenoid.extend();

        assertEquals(ExtendState.Retracted, mockSolenoid.get());
    }

    @Test
    public void testRetractInverted()
    {
        MockSolenoid mockSolenoid = new MockSolenoid(ExtendState.Retracted);
        Solenoid     solenoid     = Solenoid.invert(mockSolenoid);

        assertEquals(ExtendState.Retracted, mockSolenoid.get());

        solenoid.retract();

        assertEquals(ExtendState.Extended, mockSolenoid.get());
    }

    @Test
    public void testExtendComposed()
    {
        MockSolenoid solenoid1 = new MockSolenoid(ExtendState.Retracted);
        MockSolenoid solenoid2 = new MockSolenoid(ExtendState.Retracted);
        Solenoid     solenoid  = Solenoid.compose(solenoid1, solenoid2);

        assertEquals(ExtendState.Retracted, solenoid1.get());
        assertEquals(ExtendState.Retracted, solenoid2.get());

        solenoid.extend();

        assertEquals(ExtendState.Extended, solenoid1.get());
        assertEquals(ExtendState.Extended, solenoid2.get());
    }

    @Test
    public void testRetractComposed()
    {
        MockSolenoid solenoid1 = new MockSolenoid(ExtendState.Extended);
        MockSolenoid solenoid2 = new MockSolenoid(ExtendState.Extended);
        Solenoid     solenoid  = Solenoid.compose(solenoid1, solenoid2);

        assertEquals(ExtendState.Extended, solenoid1.get());
        assertEquals(ExtendState.Extended, solenoid2.get());

        solenoid.retract();

        assertEquals(ExtendState.Retracted, solenoid1.get());
        assertEquals(ExtendState.Retracted, solenoid2.get());
    }

    @Test
    public void testExtendComplex()
    {
        MockSolenoid solenoid1 = new MockSolenoid(ExtendState.Retracted);
        MockSolenoid solenoid2 = new MockSolenoid(ExtendState.Extended);
        Solenoid     solenoid  = Solenoid.compose(solenoid1, Solenoid.invert(solenoid2));

        assertEquals(ExtendState.Retracted, solenoid1.get());
        assertEquals(ExtendState.Extended,  solenoid2.get());

        solenoid.extend();

        assertEquals(ExtendState.Extended,  solenoid1.get());
        assertEquals(ExtendState.Retracted, solenoid2.get());
    }

    @Test
    public void testRetractComplex()
    {
        MockSolenoid solenoid1 = new MockSolenoid(ExtendState.Extended);
        MockSolenoid solenoid2 = new MockSolenoid(ExtendState.Retracted);
        Solenoid     solenoid  = Solenoid.compose(solenoid1, Solenoid.invert(solenoid2));

        assertEquals(ExtendState.Extended,  solenoid1.get());
        assertEquals(ExtendState.Retracted, solenoid2.get());

        solenoid.retract();

        assertEquals(ExtendState.Retracted, solenoid1.get());
        assertEquals(ExtendState.Extended,  solenoid2.get());
    }
}
