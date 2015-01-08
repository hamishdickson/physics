package physics.eAndM;

import physics.spaceTime.ThreeVector;

/**
 * Created by hamishdickson on 07/01/15.
 * 
 * Solve for EoM using Euler's method - ie 
 * 
 * v_{n+1} = v_{n} + deltaT(v_{n} x b)
 * 
 * where basically everything is a vector
 */
public class EulersMethod {
    private static final double DELTA_T = 0.01;

    public ThreeVector getVectorAfterDuration(ThreeVector vec, ThreeVector bField, double duration) {
        System.out.print("" + duration + "\t" + vec.getxCoord() + "\t" + vec.getyCoord() + "\t" + vec.getzCoord());
        // this is the actual solution
        System.out.println("\t" + Math.cos(20.0 - duration) + "\t" + Math.sin(duration - 20.0) + "\t" + 0.0);
        if (duration < 0 ) return vec;
        return getVectorAfterDuration( vec.addVector(vec.crossProduct(bField)).multiplyByScalar(DELTA_T),
                bField, duration - DELTA_T);
    }
}
