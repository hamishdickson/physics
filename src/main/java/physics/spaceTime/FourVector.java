package physics.spaceTime;

/**
 * Created by hamishdickson on 09/01/15.
 * 
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
}
