public class Volume extends Measurement{

    public Volume addTo(Volume toAdd){
        Measurement measurement = super.addTo(toAdd);
        return new Volume(measurement.getValue(), (VolumeUnit) measurement.getUnit());
    }

    public Volume(double value, VolumeUnit volumeUnit) {
        super(value, volumeUnit);
    }

    public Volume convertTo(VolumeUnit other) {
        Measurement measurement = super.convertTo(other);
        return new Volume(measurement.getValue(),other);
    }
}
