import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ProbabilityTest {
    @Test
    public void testShouldGivesProbability() throws Exception {
        double expected = 0.5d;
        Probability p = new Probability(0.5d);

        double actual = p.getValue();

        assertEquals(expected, actual);
    }

    @Test
    public void testShouldGivesProbabilityAtTwoConstructor() throws Exception {
        double expected = 0.5d;
        Probability p = new Probability(1d, 2d);

        double actual = p.getValue();

        assertEquals(expected, actual);
    }

    @Test
    public void testShouldGivesNotProbability() throws Exception {
        double expected = 0.4d;
        Probability p = new Probability(0.6d);

        double actual = p.not();

        assertEquals(expected, actual);
    }

    @Test
    public void testShouldGivesNotProbabilityAtTwoConstructor() throws Exception {
        double expected = 0.5d;
        Probability p = new Probability(1d, 2d);

        double actual = p.not();

        assertEquals(expected, actual);
    }

    @Test
    public void testShouldGivesProbabilityOftwo() throws Exception {
        Probability p = new Probability(1d, 2d);
        Probability p2 = new Probability(1d, 2d);
        Probability expected = new Probability(0.25);

        Probability actual = p.and(p2);

        assertEquals(expected, actual);
    }

    @Test
    public void testShouldGivesOrProbability() throws Exception {
        Probability p = new Probability(1d, 6d);
        Probability p2 = new Probability(1d, 6d);
        Probability expected = new Probability(0.3055555555555555);

        Probability actual = p.or(p2);

        assertEquals(true, expected.equals(actual));
    }

    @Test
    public void testShouldGivesXOrProbability() throws Exception {
        Probability p = new Probability(1d, 6d);
        Probability p2 = new Probability(1d, 6d);
        Probability expected = new Probability(0.27777777777777773);

        Probability actual = p.XOr(p2);

        assertEquals(true, expected.equals(actual));
    }
}
