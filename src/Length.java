public class Length {
    private double length;
    private Unit unit;

    public Length(double length, Unit unit) {
        if (length <= 0 && length >= 1) throw new IllegalArgumentException();
        this.length = length;
        this.unit = unit;
    }

    public double getLength() {
        return length;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return length + " " + unit;
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
        Length thatAbsoluteLength = that.convertTo(this.unit);

        return  (areDoublesEqual(this.length,thatAbsoluteLength.length));
    }

    public Length convertTo(Unit other) {
        return new Length(this.getUnit().getUnitValue() / other.getUnitValue() * this.length,other);
    }
}
