public class Probability {
    private final Double probability;

    public Probability(double probability) {
        if (probability <= 0 && probability >= 1) throw new IllegalArgumentException();
        this.probability = probability;
    }

    public Probability(double v, double v1) {
        this(v / v1);
    }

    public double getValue() {
        return this.probability;
    }

    public double not() {
        return 1 - this.probability;
    }

    public Probability and(Probability p2) {
        return new Probability(this.probability * p2.probability);
    }

    public Probability or(Probability p2) {
        return new Probability(this.probability + p2.probability - and(p2).getValue());
    }
    public Probability XOr(Probability p2) {
        return new Probability(or(p2).getValue()-and(p2).getValue());
    }
    @Override
    public boolean equals(Object o) {
        Probability p2 = (Probability)o;
        return this.probability.equals(p2.probability);
    }


}
