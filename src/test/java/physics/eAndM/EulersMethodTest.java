package physics.eAndM;

import junit.framework.TestCase;
import org.junit.Test;
import physics.spaceTime.ThreeVector;

public class EulersMethodTest extends TestCase {
    @Test
    public void testThatItDoesntDie() {
        ThreeVector v = new ThreeVector(1, 0, 0);
        ThreeVector b = new ThreeVector(0, 0, 1);
        EulersMethod eulersMethod = new EulersMethod();
        
        // todo note doesn't actually assert anything yet!
        eulersMethod.getVectorAfterDuration(v, b, 20.0);
    }

}