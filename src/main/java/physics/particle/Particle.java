package physics.particle;

import physics.spaceTime.FourVector;

/**
 * Created by hamishdickson on 10/01/15.
 * 
 * This section of the notes is so badly written!
 * 
 * todo as it's unclear what's wanted here, think about what would be useful for physics in general
 */
public class Particle {
    private double mass;
    private FourVector energy;
    private FourVector kineticEnergy;
    private FourVector momentum;
    private FourVector velocity;

    public Particle(double mass, FourVector energy, FourVector kineticEnergy, FourVector momentum, FourVector velocity) {
        this.mass = mass;
        this.energy = energy;
        this.kineticEnergy = kineticEnergy;
        this.momentum = momentum;
        this.velocity = velocity;
    }

    public double getMass() {
        return mass;
    }

    public FourVector getEnergy() {
        return energy;
    }

    public FourVector getKineticEnergy() {
        return kineticEnergy;
    }

    public FourVector getMomentum() {
        return momentum;
    }

    public FourVector getVelocity() {
        return velocity;
    }
}
