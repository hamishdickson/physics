package physics.specialRelativity;

/**
 * Created by hamishdickson on 07/01/15.
 *
 * These should be unit tests
 */
public class SpecialRelativity {
    public static void main(String[] args) {
        ThreeVector v0 = new ThreeVector();
        System.out.println("v0 = " + v0.toString());

        ThreeVector v1 = new ThreeVector(-1.3054, 7.4033, 2.7362);
        System.out.println("v1 = " + v1.toString());

        ThreeVector v2 = new ThreeVector(8.0, 70.0, 100.0, 'd');
        System.out.println("v2 = " + v2.toString());

        ThreeVector v3 = new ThreeVector(8.0, 1.2217, 1.7453, 'r');
        System.out.println("v3 = " + v3.toString());
    }
}
