public class Measurement implements Cloneable{
    private double value;
    private Unit unit;


    public Measurement(double value, Unit unit) {
        if (value <= 0 && value >= 1) throw new IllegalArgumentException();
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
    public static boolean areDoublesEqual(double a, double b){
        double DELTA = 0.05;
        return a == b || Math.abs(a - b) < DELTA;
    }
    @Override
    public boolean equals(Object o) {
        if (null == o || this.getClass() != o.getClass()) {
            return false;
        }
        Measurement that = (Measurement)o;
        Measurement thatAbsoluteValue = that.convertTo(this.unit);

        return  (areDoublesEqual(this.value,thatAbsoluteValue.value));
    }

    public Measurement convertTo(Unit other) {
        return new Measurement(this.getUnit().getUnitValue() / other.getUnitValue() * this.value,other);
    }

    public Measurement addTo(Measurement toAdd) {
        if(this.getUnit().getUnitValue() > toAdd.getUnit().getUnitValue()){
            return new Measurement(this.getValue() + toAdd.convertTo(this.getUnit()).getValue(),this.getUnit());
        }
        return new Measurement(toAdd.getValue() + this.convertTo(toAdd.getUnit()).getValue(),toAdd.getUnit());
    }
}
