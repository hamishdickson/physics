package physics.spaceTime;

import static java.lang.Math.*;

/**
 * Created by hamishdickson on 07/01/15.
 */
public class ThreeVector {
    private double xCoord;
    private double yCoord;
    private double zCoord;

    public ThreeVector() {
        this.xCoord = 0.0;
        this.yCoord = 0.0;
        this.zCoord = 0.0;
    }

    public ThreeVector(double xCoord, double yCoord, double zCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zCoord = zCoord;
    }

    /**
     * Creates the three vector using spherical coords - throws an exception if type isn't
     * d = degrees or r = radians
     */
    public ThreeVector(double r, double theta, double phi, char type) throws IllegalArgumentException {
        if (type == 'r') {
            this.xCoord = r * sin(theta) * cos(phi);
            this.yCoord = r * sin(theta) * sin(phi);
            this.zCoord = r * cos(theta);
        } else if (type == 'd') {
            this.xCoord = r * sin(theta * PI / 180) * cos(phi * PI / 180);
            this.yCoord = r * sin(theta * PI / 180) * sin(phi * PI / 180);
            this.zCoord = r * cos(theta * PI / 180);
        } else {
            throw new IllegalArgumentException();
        }

    }

    public double square() {
        return (xCoord * xCoord) + (yCoord * yCoord) + (zCoord * zCoord);
    }

    public double mag3() {
        return sqrt(square());
    }

    public double getTheta() {
        return acos(zCoord / mag3());
    }

    public double getPhi() {
        return atan(yCoord / mag3());
    }

    public double getxCoord() {
        return xCoord;
    }

    public void setxCoord(double xCoord) {
        this.xCoord = xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public void setyCoord(double yCoord) {
        this.yCoord = yCoord;
    }

    public double getzCoord() {
        return zCoord;
    }

    public void setzCoord(double zCoord) {
        this.zCoord = zCoord;
    }

    public ThreeVector addVector(ThreeVector v) {
        ThreeVector threeVector = new ThreeVector(this.xCoord + v.getxCoord(), 
                                                  this.yCoord + v.getyCoord(), 
                                                  this.zCoord + v.getzCoord());
        return threeVector;
    }

    @Override
    public String toString() {
        return "" + xCoord + "\t" + yCoord + "\t" + zCoord;
    }

    public double scalarProduct(ThreeVector threeVector) {
        double out = this.xCoord * threeVector.getxCoord() +
                this.yCoord * threeVector.getyCoord() +
                this.zCoord * threeVector.getzCoord();
        return out;
    }

    public ThreeVector crossProduct(ThreeVector v) {
        ThreeVector threeVector = new ThreeVector(this.yCoord * v.getzCoord() - this.zCoord * v.getyCoord(),
                this.zCoord * v.getxCoord() - this.xCoord * v.getzCoord(),
                this.xCoord * v.getyCoord() - this.yCoord * v.getxCoord());
        return threeVector;
    }

    public ThreeVector multiplyByScalar(double num) {
        return new ThreeVector(num * this.xCoord,
                num * this.yCoord,
                num * this.zCoord);
    }
}
