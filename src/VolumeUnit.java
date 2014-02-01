public enum VolumeUnit {
    MILILITRE(0.001), LITRE(1), KILOLITRE(1000), GALLON(3.79);
    private final double unitValue;

    VolumeUnit(double referTo) {
        this.unitValue = referTo;
    }

    public double getUnitValue() {
        return unitValue;
    }
}
