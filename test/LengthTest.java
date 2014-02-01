import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LengthTest {
    @Test
    public void testEqualsOfLength() throws Exception {
        Length lengthInMeter = new Length(10, LengthUnit.METER);
        Length lengthInMeter1 = new Length(10, LengthUnit.METER);
        assertEquals(true,lengthInMeter.equals(lengthInMeter1));
    }

    @Test
    public void testShouldGiveLengthInCentiMeter() throws Exception {
        Length lengthInCentimeter = new Length(10, LengthUnit.CENTIMETER);

        assertEquals(10.0, lengthInCentimeter.getLength());
        assertEquals(LengthUnit.CENTIMETER, lengthInCentimeter.getLengthUnit());
    }

    @Test
    public void testShouldConvertLengthFromMeterToCentiMeter() throws Exception {
        Length lengthInMeter = new Length(1, LengthUnit.METER);

        Length lengthInCentimeter = lengthInMeter.convertTo(LengthUnit.CENTIMETER);
        assertEquals(lengthInMeter, lengthInCentimeter);
    }

    @Test
    public void testShouldConvertLengthFromCentiMeterToMeter() throws Exception {
        Length lengthInCentimeter = new Length(100, LengthUnit.CENTIMETER);

        Length lengthInMeter = lengthInCentimeter.convertTo(LengthUnit.METER);
        assertEquals(lengthInCentimeter, lengthInMeter);
    }

    @Test
    public void testShouldConvertLengthFromMeterToKiloMeter() throws Exception {
        Length lengthInMeter = new Length(2000, LengthUnit.METER);

        Length lengthInKilometer = lengthInMeter.convertTo(LengthUnit.KILOMETER);
        assertEquals(lengthInMeter, lengthInKilometer);
        assertEquals(lengthInKilometer.getLength(), 2.0);
    }

    @Test
    public void testShouldConvertLengthFromCentiMeterToMiliMeter() throws Exception {
        Length lengthInCentimeter = new Length(20, LengthUnit.CENTIMETER);

        Length lengthInMilimeter = lengthInCentimeter.convertTo(LengthUnit.MILIMETER);
        assertEquals(lengthInCentimeter, lengthInMilimeter);
        assertEquals(lengthInMilimeter.getLength(), 200.0);
    }

    @Test
    public void testShouldConvertLengthFromMeterToInch() throws Exception {
        Length lengthInMeter = new Length(1, LengthUnit.METER);

        Length lengthInInch = lengthInMeter.convertTo(LengthUnit.INCH);
        assertEquals(lengthInMeter, lengthInInch);
        assertEquals(39.3701, lengthInInch.getLength(), 0.1);

    }

    @Test
    public void testShouldConvertLengthFromInchToFeet() throws Exception {
        Length lengthInInch = new Length(12, LengthUnit.INCH);

        Length lengthInFeet = lengthInInch.convertTo(LengthUnit.FEET);
        assertEquals(lengthInInch, lengthInFeet);
        assertEquals(1.0, lengthInFeet.getLength());

    }

    @Test
    public void testShouldConvertLengthFromFeetToYard() throws Exception {
        Length lengthInFeet = new Length(3, LengthUnit.FEET);

        Length lengthInYard = lengthInFeet.convertTo(LengthUnit.YARD);
        assertEquals(1.0, lengthInYard.getLength());

    }
    @Test
    public void testShouldConvertLengthFromKilometerToMiles() throws Exception {
        Length lengthInKilometer = new Length(1, LengthUnit.KILOMETER);

        Length lengthInMile = lengthInKilometer.convertTo(LengthUnit.MILE);
        assertEquals(0.621371, lengthInMile.getLength(),0.001);

    }
}
