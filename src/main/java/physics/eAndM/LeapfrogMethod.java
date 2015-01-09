package physics.eAndM;

import physics.spaceTime.ThreeVector;

/**
 * Created by hamishdickson on 08/01/15.
 * 
 * a better approximation for the magnetic field
 * 
 * The problem here is the approximation of the derivative, instead we could use what is known as the 
 * center derivative
 * 
 * (dv/dt)|_{n}  ~=  (v_{n + 1} - v_{n - 1} ) / (2 deltaT)
 * 
 * which means
 * 
 * v_{n+1} ~= v_{n-1} + 2 * deltaT * (v_{n} x b)
 * 
 * Note, there is a complexity here, you need to initialize two values of v. For this we can seed it with Euler's
 * method
 */
public class LeapfrogMethod {
    private static final double DELTA_T = 0.01;
    private static final double DURATION = 20.0;

    // todo refactor this out with euler's method
    public ThreeVector seed(ThreeVector vector, ThreeVector bField) {
        return vector.addVector(vector.crossProduct(bField)).multiplyByScalar(DELTA_T);
    }
    
    public ThreeVector leapFrog(ThreeVector vector, ThreeVector bField) {
        ThreeVector nMinusOne = vector;
        ThreeVector n = seed(nMinusOne, bField);
        
        for (double t = 0.01; t < DURATION; t += DELTA_T) {
            nMinusOne = n;
            n = nMinusOne.addVector(n.crossProduct(bField).multiplyByScalar(2 * DELTA_T));
        }
        
        return n;
    }
}
