package physics.particle;

import physics.spaceTime.FourVector;

/**
 * Created by hamishdickson on 10/01/15.
 * 
 * This is badly written - I'm not actually sure what the form is even asking for
 */
public class Particle extends FourVector {
    private double mass;

    public Particle(double mass) {
        this.mass = mass;
    }

    public Particle(double tCoord, double xCoord, double yCoord, double zCoord, double mass) {
        super(tCoord, xCoord, yCoord, zCoord);
        this.mass = mass;
    }
    
    
}
