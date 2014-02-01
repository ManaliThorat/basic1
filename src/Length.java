public class Length extends Measurement {

    public Length(double length, LengthUnit lengthUnit) {
        super(length,lengthUnit);
    }

    public Length convertTo(LengthUnit other) {
        Measurement measurement = super.convertTo(other);
        return new Length(measurement.getValue(),other);
    }

}
