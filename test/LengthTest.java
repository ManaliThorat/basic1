import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LengthTest {
    @Test
    public void testShouldGiveLengthInMeter() throws Exception {
        Length lengthInMeter = new Length(10, Unit.METER);

        assertEquals(10.0, lengthInMeter.getLength());
        assertEquals(Unit.METER, lengthInMeter.getUnit());
    }

    @Test
    public void testShouldGiveLengthInCentiMeter() throws Exception {
        Length lengthInCentimeter = new Length(10, Unit.CENTIMETER);

        assertEquals(10.0, lengthInCentimeter.getLength());
        assertEquals(Unit.CENTIMETER, lengthInCentimeter.getUnit());
    }

    @Test
    public void testShouldConvertLengthFromMeterToCentiMeter() throws Exception {
        Length lengthInMeter = new Length(1, Unit.METER);

        Length lengthInCentimeter = lengthInMeter.convertTo(Unit.CENTIMETER);
        assertEquals(lengthInMeter, lengthInCentimeter);
    }

    @Test
    public void testShouldConvertLengthFromCentiMeterToMeter() throws Exception {
        Length lengthInCentimeter = new Length(100, Unit.CENTIMETER);

        Length lengthInMeter = lengthInCentimeter.convertTo(Unit.METER);
        assertEquals(lengthInCentimeter, lengthInMeter);
    }

    @Test
    public void testShouldConvertLengthFromMeterToKiloMeter() throws Exception {
        Length lengthInMeter = new Length(2000, Unit.METER);

        Length lengthInKilometer = lengthInMeter.convertTo(Unit.KILOMETER);
        assertEquals(lengthInMeter, lengthInKilometer);
        assertEquals(lengthInKilometer.getLength(), 2.0);
    }

    @Test
    public void testShouldConvertLengthFromCentiMeterToMiliMeter() throws Exception {
        Length lengthInCentimeter = new Length(20, Unit.CENTIMETER);

        Length lengthInMilimeter = lengthInCentimeter.convertTo(Unit.MILIMETER);
        assertEquals(lengthInCentimeter, lengthInMilimeter);
        assertEquals(lengthInMilimeter.getLength(), 200.0);
    }

    @Test
    public void testShouldConvertLengthFromMeterToInch() throws Exception {
        Length lengthInMeter = new Length(1, Unit.METER);

        Length lengthInInch = lengthInMeter.convertTo(Unit.INCH);
        assertEquals(lengthInMeter, lengthInInch);
        assertEquals(39.3701, lengthInInch.getLength(), 0.1);

    }

    @Test
    public void testShouldConvertLengthFromInchToFeet() throws Exception {
        Length lengthInInch = new Length(12, Unit.INCH);

        Length lengthInFeet = lengthInInch.convertTo(Unit.FEET);
        assertEquals(lengthInInch, lengthInFeet);
        assertEquals(1.0, lengthInFeet.getLength());

    }

    @Test
    public void testShouldConvertLengthFromFeetToYard() throws Exception {
        Length lengthInFeet = new Length(3, Unit.FEET);

        Length lengthInYard = lengthInFeet.convertTo(Unit.YARD);
        assertEquals(1.0, lengthInYard.getLength());

    }
    @Test
    public void testShouldConvertLengthFromKilometerToMiles() throws Exception {
        Length lengthInKilometer = new Length(1, Unit.KILOMETER);

        Length lengthInMile = lengthInKilometer.convertTo(Unit.MILE);
        assertEquals(0.621371, lengthInMile.getLength(),0.001);

    }
}
