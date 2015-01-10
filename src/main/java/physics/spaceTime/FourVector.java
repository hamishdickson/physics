package physics.spaceTime;

/**
 * Created by hamishdickson on 09/01/15.
 * 
 * don't judge me for this - I'm aware it's a bit stupid!
 */
public class FourVector extends ThreeVector {
    private double tCoord;

    public FourVector() {
        super();
        this.tCoord = 0.0;
    }
    
    public FourVector(double tCoord, double xCoord, double yCoord, double zCoord) {
        super(xCoord, yCoord, zCoord);
        this.tCoord = tCoord;
    }
    
    public FourVector(double tCoord, ThreeVector threeVector) {
        super(threeVector.getxCoord(), threeVector.getyCoord(), threeVector.getzCoord());
        this.tCoord = tCoord;
    }

    @Override
    public String toString() {
        return "" + tCoord + "\t" + this.getxCoord() + "\t" + this.getyCoord() + "\t" + this.getzCoord();
    }

    @Override
    public double square() {
        return tCoord * tCoord - super.square() ;
    }

    public double gettCoord() {
        return tCoord;
    }

    public void settCoord(double tCoord) {
        this.tCoord = tCoord;
    }
}
