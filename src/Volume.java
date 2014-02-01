public class Volume {

    private double value;
    private VolumeUnit unit;

    public Volume(double value, VolumeUnit unit) {

        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public VolumeUnit getVolumeUnit() {
        return unit;
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
        Volume that = (Volume)o;
        Volume thatAbsoluteValume = that.convertTo(this.getVolumeUnit());

        return  (areDoublesEqual(this.value,thatAbsoluteValume.value));
    }
    public Volume convertTo(VolumeUnit other) {
        return new Volume(this.getVolumeUnit().getUnitValue() / other.getUnitValue() * this.value,other);

    }
}
