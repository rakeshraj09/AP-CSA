/**
 * Display information on Mars
 *
 * @author Rakesh Raj
 * @version 07/08/24
 * 
 */

public class PlanetGravity
{
    public static double Gravity(double mass, double diameterKm) {
        double gravitationalConstant = 6.67E-11;
        double radius = diameterKm*1000/2;
        return (int)(gravitationalConstant*mass/Math.pow(radius, 2)*100)/100.0;
    }

    public static void Header() {
        System.out.println("\t\tPlanetary Data\nPlanet\tDiameter (km)\tMass (kg)\tg (m/s^2)\n-------------------------------------------------");
    }

    public static void DisplayInfo(double diameter, double mass, double g) {
        System.out.println("Mars\t" + diameter + "\t\t" + mass + "\t" + g);
    }

    public static void main(String [] args)
    {
        //double diameter = 6794.0;
        //double mass = 6.4219E23;
        //double g = Gravity(mass, diameter);
        //Header();
        //DisplayInfo(diameter, mass, g);
        
    }

    public static int Method(String input) {
        int length = 0;
        while(input.indexOf(" ") != -1) {
            int spaceIndex = input.indexOf(" ");
            String substring =  input.substring(0, spaceIndex);
            length += substring.length();
            input = input.substring(spaceIndex+1);
        }
        return length+=input.length();
    }
}

