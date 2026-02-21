/**
 * Purpose: To find the hypotenuse of a right triangle with randomly generated leg lengths
 * 
 * @author Rakesh Raj
 * @version 06/10/24
 */

public class PyTheorem
{
    public static void main(String [] args) 
    {
        int a1 = (int)(Math.random()*18 + 5);
        int b1 = (int)(Math.random()*18 + 5);
        double hypotenuse1 = Math.sqrt(Math.pow(a1, 2) + Math.pow(b1, 2));
        int a2 = (int)(Math.random()*18 + 5);
        int b2 = (int)(Math.random()*18 + 5);
        double hypotenuse2 = Math.sqrt(Math.pow(a2, 2) + Math.pow(b2, 2));

        System.out.println("Triangle 1  Side 1: " + a1 + "  Side 2: " + b1 + "  Hypotenuse: " + hypotenuse1);
        System.out.println("Triangle 2  Side 1: " + a2 + "  Side 2: " + b2 + "  Hypotenuse: " + hypotenuse2);
    }
}