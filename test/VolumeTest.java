import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class VolumeTest {
    @Test
    public void testEqualsOfVolume() throws Exception {
        Volume volume1 = new Volume(10, VolumeUnit.LITRE);
        Volume volume2 = new Volume(10, VolumeUnit.LITRE);
        assertEquals(true,volume1.equals(volume2));


    }
    @Test
    public void shouldGiveVolumeInSpecifiedUnit() throws Exception {
        Volume volumeInLitre = new Volume(10, VolumeUnit.LITRE);

        assertEquals(10.0, volumeInLitre.getValue());
        assertEquals(VolumeUnit.LITRE, volumeInLitre.getUnit());
    }
    @Test
    public void testShouldConvertLengthFromMillilitreToLitre() throws Exception {
        Volume VolumeInMilliLitre = new Volume(1000, VolumeUnit.MILILITRE);
        Volume volume1 = new Volume(1,VolumeUnit.LITRE);
        Volume volumeInLitre = VolumeInMilliLitre.convertTo(VolumeUnit.LITRE);
        assertEquals(volume1,volumeInLitre);


    }
    @Test
    public void testShouldConvertLengthFromLitreToKiloLitre() throws Exception {
        Volume VolumeInLitre = new Volume(1000, VolumeUnit.LITRE);
        Volume volume1 = new Volume(1,VolumeUnit.KILOLITRE);

        Volume volumeInKiloLitre = VolumeInLitre.convertTo(VolumeUnit.KILOLITRE);
        assertEquals(volume1,volumeInKiloLitre);
    }
    @Test
    public void testShouldConvertLengthFromKiloLitreToGallons() throws Exception {
        Volume volumeInKiloLitre = new Volume(1, VolumeUnit.KILOLITRE);
        Volume volumeInGallon = volumeInKiloLitre.convertTo(VolumeUnit.GALLON);

        assertEquals(volumeInGallon,volumeInKiloLitre);
    }
    @Test
    public void testShouldAddTwoUnitsOfCompatibleTypes() throws Exception {
        Volume volumeInKiloLitre = new Volume(1, VolumeUnit.KILOLITRE);
        Volume volumeInLitre = new Volume(1000, VolumeUnit.LITRE);
        Volume expected = new Volume(2, VolumeUnit.KILOLITRE);

        Volume actual = volumeInLitre.addTo(volumeInKiloLitre);
        assertEquals(expected,actual);
        assertEquals(expected.getUnit(),actual.getUnit());
    }


}
