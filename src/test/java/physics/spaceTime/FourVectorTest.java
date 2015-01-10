package physics.spaceTime;

import junit.framework.TestCase;
import org.junit.Test;

public class FourVectorTest extends TestCase {
    @Test
    public void testThatFourVectorCreationWorks() {
        ThreeVector threeVector = new ThreeVector(1.0, 2.0, 3.0);
        FourVector fourVector1 = new FourVector();
        FourVector fourVector2 = new FourVector(4.0, 5.0, 6.0, 7.0);
        FourVector fourVector3 = new FourVector(4.0, threeVector);
        
        assertEquals("0.0\t0.0\t0.0\t0.0", fourVector1.toString());
    }

    /**
     * assume we are in mink space 
     * ie square = t^2 - r^2 
     */
    @Test
    public void testThatSquareObeysMinkowskiSpace() {
        FourVector fourVector = new FourVector(5.0, 1.0, 2.0, 3.0);
        
        assertEquals(11.0, fourVector.square(), 0.01);
    }

}