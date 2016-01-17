package tests;

import model.Coordinates;
import model.obstacle.Circle;
import model.obstacle.Rectangle;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Benjamin on 17/01/16.
 */
public class RectangleTest {

    @Test
    public void testCollideWithCircle() throws Exception {
        Rectangle r = new Rectangle(new Coordinates( 10, 10));
        Circle c1 = new Circle(new Coordinates(0, 0));
        Circle c2 = new Circle(new Coordinates(50, 50));
        assertTrue(r.collideWithCircle(c1.getCoordinates(), c1.RADIUS));
        assertFalse(r.collideWithCircle(c2.getCoordinates(), c2.RADIUS));
    }

    @Test
    public void testCollideWithRectangle() throws Exception {
        Rectangle r = new Rectangle(new Coordinates(10, 10));
        Rectangle r1 = new Rectangle(new Coordinates(2, 2));
        Rectangle r2 = new Rectangle(new Coordinates(50, 50));
        assertTrue(r.collideWithRectangle(r1.getCoordinates(), r1.RADIUS));
        assertFalse(r.collideWithRectangle(r2.getCoordinates(), r2.RADIUS));
    }
}