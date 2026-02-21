/*
Rakesh Raj
3/13/25
Purpose: calculate how far a projectile travels given speed and angle launched (client/tester class)
*/

public class CatapultTester {
    public static void main(String[] args) {
        int[] speed = new int[]{15, 20, 25, 30, 35};
        int [] angle = new int[]{20, 25, 30, 35, 40, 45};

        double[][] dists = new double[5][6];

        //calc distance for each speed/angle and put it in 2d array
        for(int i=0; i<speed.length; i++){
            for(int j=0; j<angle.length; j++){
                dists[i][j] = Catapult.calcDistance(speed[i], angle[j]);
            }
        }

        //print distances in table
        System.out.printf("%45s\n", "Projectile Distance (feet)");
        System.out.println(" MPH    15 Deg    20 Deg    25 Deg    30 Deg    35 Deg    ");
        System.out.println("===========================================================");

        for(int i=0; i<speed.length; i++){
            int j = 0;
            System.out.printf("%4d%10.3f%10.3f%10.3f%10.3f%10.3f\n", speed[i], dists[i][j], dists[i][j+1], dists[i][j+2], dists[i][j+3], dists[i][j+4]);
        }
    }
}
