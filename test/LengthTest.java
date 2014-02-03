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
    public void testEqualsOfLengthNotEqual() throws Exception {
        Length lengthInMeter = new Length(10, LengthUnit.METER);
        Length lengthInMeter1 = new Length(10, LengthUnit.KILOMETER);

        assertEquals(false,lengthInMeter.equals(lengthInMeter1));
    }
    @Test
     public void testEqualsOfFor2DifferentUnits() throws Exception {
        Length lengthInMeter = new Length(1000, LengthUnit.METER);
        Length lengthInMeter1 = new Length(1, LengthUnit.KILOMETER);

        assertEquals(true,lengthInMeter.equals(lengthInMeter1));
    }

    @Test
    public void testClone() throws Exception {
        Length lengthInMeter = new Length(1000, LengthUnit.METER);
        assertEquals(lengthInMeter,lengthInMeter.clone());
    }

    @Test
    public void testShouldConvertLengthFromMeterToCentiMeter() throws Exception {
        Length lengthInMeter = new Length(1, LengthUnit.METER);
        Length lengthInCentimeter = lengthInMeter.convertTo(LengthUnit.CENTIMETER);
        Length expected = new Length(100,LengthUnit.CENTIMETER);

        assertEquals(expected, lengthInCentimeter);
    }

    @Test
    public void testShouldConvertLengthFromCentiMeterToMeter() throws Exception {
        Length lengthInCentimeter = new Length(100, LengthUnit.CENTIMETER);
        Length lengthInMeter = lengthInCentimeter.convertTo(LengthUnit.METER);
        Length expected = new Length(1,LengthUnit.METER);

        assertEquals(expected, lengthInMeter);
    }

    @Test
    public void testShouldConvertLengthFromMeterToKiloMeter() throws Exception {
        Length lengthInMeter = new Length(2000, LengthUnit.METER);
        Length lengthInKilometer = lengthInMeter.convertTo(LengthUnit.KILOMETER);
        Length expected = new Length(2,LengthUnit.KILOMETER);

        assertEquals(expected, lengthInKilometer);
    }

    @Test
    public void testShouldConvertLengthFromCentiMeterToMiliMeter() throws Exception {
        Length lengthInCentimeter = new Length(20, LengthUnit.CENTIMETER);
        Length lengthInMilimeter = lengthInCentimeter.convertTo(LengthUnit.MILIMETER);
        Length expected = new Length(200,LengthUnit.MILIMETER);

        assertEquals(expected, lengthInMilimeter);
    }

    @Test
    public void testShouldConvertLengthFromMeterToInch() throws Exception {
        Length lengthInMeter = new Length(1, LengthUnit.METER);
        Length lengthInInch = lengthInMeter.convertTo(LengthUnit.INCH);
        Length expected = new Length(39.3700,LengthUnit.INCH);

        assertEquals(expected, lengthInInch);
    }

    @Test
    public void testShouldConvertLengthFromInchToFeet() throws Exception {
        Length lengthInInch = new Length(12, LengthUnit.INCH);
        Length lengthInFeet = lengthInInch.convertTo(LengthUnit.FEET);
        Length expected = new Length(1,LengthUnit.FEET);

        assertEquals(expected, lengthInFeet);
    }

    @Test
    public void testShouldConvertLengthFromFeetToYard() throws Exception {
        Length lengthInFeet = new Length(3, LengthUnit.FEET);
        Length lengthInYard = lengthInFeet.convertTo(LengthUnit.YARD);
        Length expected = new Length(1,LengthUnit.YARD);

        assertEquals(expected,lengthInYard);
    }
    @Test
    public void testShouldConvertLengthFromKilometerToMiles() throws Exception {
        Length lengthInKilometer = new Length(1.64, LengthUnit.KILOMETER);
        Length lengthInMile = lengthInKilometer.convertTo(LengthUnit.MILE);
        Length expected = new Length(1,LengthUnit.MILE);

        assertEquals(expected,lengthInMile);
    }
    @Test
    public void testShouldAddTwoUnitsOfCompatibleTypes() throws Exception {
        Length lengthInKilometer = new Length(1, LengthUnit.KILOMETER);
        Length lengthInMiter = new Length(1000, LengthUnit.METER);
        Length expected = new Length(2, LengthUnit.KILOMETER);

        Length actual = lengthInMiter.addTo(lengthInKilometer);
        assertEquals(expected,actual);
        assertEquals(expected.getUnit(),actual.getUnit());
    }
    @Test
    public void ShouldAddTwoLengthsOfSameUnit() throws Exception {
        Length lengthInKilometer = new Length(1, LengthUnit.KILOMETER);
        Length lengthInMiter = new Length(1, LengthUnit.KILOMETER);
        Length expected = new Length(2, LengthUnit.KILOMETER);

        Length actual = lengthInMiter.addTo(lengthInKilometer);
        assertEquals(expected,actual);
        assertEquals(expected.getUnit(),actual.getUnit());
    }
}
