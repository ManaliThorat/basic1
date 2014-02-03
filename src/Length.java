public class Length extends Measurement implements Cloneable{
    @Override
    protected Length clone() throws CloneNotSupportedException {
        return new Length(this.getValue(), (LengthUnit) this.getUnit());
    }

    public Length(double length, LengthUnit lengthUnit) {
        super(length,lengthUnit);
    }

    public Length convertTo(LengthUnit other) {
        Measurement measurement = super.convertTo(other);
        return new Length(measurement.getValue(),other);
    }

    public Length addTo(Length toAdd){
        Measurement measurement = super.addTo(toAdd);
        return new Length(measurement.getValue(), (LengthUnit) measurement.getUnit());
    }
}
