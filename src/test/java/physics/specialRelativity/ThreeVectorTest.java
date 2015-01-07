package physics.specialRelativity;

import junit.framework.TestCase;
import org.junit.Test;

public class ThreeVectorTest extends TestCase {
    @Test
    public void testThatNoPassedValuesRemainZero() {
        ThreeVector v0 = new ThreeVector();
        assertEquals("0.0\t0.0\t0.0", v0.toString());
    }

    @Test
    public void testThatValuesAreApplied() {
        ThreeVector v1 = new ThreeVector(-1.3054, 7.4033, 2.7362);
        assertEquals("-1.3054\t7.4033\t2.7362", v1.toString());
    }

    @Test
    public void testThatDegreesWork() {
        ThreeVector v2 = new ThreeVector(8.0, 70.0, 100.0, 'd');
        assertEquals("-1.3054072893322781\t7.403332627186586\t2.7361611466053506", v2.toString());
    }

    @Test
    public void testThatRadiansWork() {
        ThreeVector v3 = new ThreeVector(8.0, 1.2217, 1.7453, 'r');
        assertEquals("-1.3051762480941964\t7.403288684449483\t2.736390252890292", v3.toString());
    }

    @Test
    public void testAddVectorActuallyAdds() {
        ThreeVector v1 = new ThreeVector(1.0, 1.0, 1.0);
        ThreeVector v2 = new ThreeVector(2.0, 2.0, 2.0);

        ThreeVector v3 = new ThreeVector(3.0, 3.0, 3.0);

        assertEquals(v3.toString(), v1.addVector(v2).toString());
    }
    
    @Test
    public void testScalarProductOfTwoVectors() {
        ThreeVector v1 = new ThreeVector(1.0, 1.0, 1.0);
        ThreeVector v2 = new ThreeVector(2.0, 2.0, 2.0);

        assertEquals(6.0, v1.scalarProduct(v2));
    }

    @Test
    public void testCrossProductOfTwoVectors() {
        ThreeVector v1 = new ThreeVector(1.0, 2.0, 3.0);
        ThreeVector v2 = new ThreeVector(4.0, 5.0, 6.0);

        ThreeVector v3 = new ThreeVector(-3.0, 6.0, -3.0);

        assertEquals(v3.toString(), v1.crossProduct(v2).toString());

    }
}