/*
Rakesh Raj
3/13/25
Purpose: calculate how far a projectile travels given speed and angle launched (implementation class)
*/
public class Catapult {
    private int speed;
    private int angle;

    public Catapult(int speed, int angle){
        this.speed = speed;
        this.angle = angle;
    }

    //convert speed to m/s to calc range and then convert to ft
    public static double calcDistance(int speedInMiles, int angle){
        return(((speedInMiles*0.447)*(speedInMiles*0.447)*(Math.sin(2*Math.toRadians(angle)))/9.8)*3.2808);
    }
}
