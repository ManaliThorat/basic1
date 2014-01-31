import junit.framework.Assert;
import org.junit.Test;


public class AreaTest {
    @Test
    public void testShouldGivesRectanglesArea() throws Exception {
        int expected = 15;
        Rectangle rect = Rectangle.createRectangle(3,5);

        int actual = rect.getArea();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testShouldGivesRectanglesPerimeter() throws Exception {
        int expected = 16;
        Rectangle rect = Rectangle.createRectangle(3,5);

        int actual = rect.getPerimeter();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testShouldGivesSquaresArea() throws Exception {
        int expected = 9;
        Rectangle rect = Rectangle.createSquare(3);

        int actual = rect.getArea();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testShouldGivesSquaresPerimeter() throws Exception {
        int expected = 12;
        Rectangle rect = Rectangle.createSquare(3);

        int actual = rect.getPerimeter();

        Assert.assertEquals(expected, actual);
    }

}
