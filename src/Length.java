public class Length extends Measurement {
    private double length;
    private LengthUnit lengthUnit;

    public Length(double length, LengthUnit lengthUnit) {
        if (length <= 0 && length >= 1) throw new IllegalArgumentException();
        this.length = length;
        this.lengthUnit = lengthUnit;
    }

    public double getLength() {
        return length;
    }

    public LengthUnit getLengthUnit() {
        return lengthUnit;
    }

    @Override
    public String toString() {
        return length + " " + lengthUnit;
    }
    public static boolean areDoublesEqual(double a, double b){
        double DELTA = 0.0004;
        return a == b || Math.abs(a - b) < DELTA;
    }
    @Override
    public boolean equals(Object o) {
        if (null == o || this.getClass() != o.getClass()) {
            return false;
        }
        Length that = (Length)o;
        Length thatAbsoluteLength = that.convertTo(this.lengthUnit);

        return  (areDoublesEqual(this.length,thatAbsoluteLength.length));
    }

    public Length convertTo(LengthUnit other) {
        return new Length(this.getLengthUnit().getUnitValue() / other.getUnitValue() * this.length,other);
    }
}
