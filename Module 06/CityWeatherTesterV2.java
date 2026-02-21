/**
 * Annual Weather client class
 * 
 * @author Rakesh Raj
 * @version 10/20/24
 */
import java.util.Scanner;
public class CityWeatherTesterV2
{
    
   
    
    // method to print results (formatting output will be done in 6.02)
    
        //Output: display table of weather data including average and total
        //System.out.println();
        //System.out.println("           Weather Data");
        //System.out.println("      Location: " + city +", " + state);
        //System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        //System.out.println();
        //System.out.println("***************************************************");
        //for( int index = 0; index < temperature.length; index++)
        //{
  		// use printf to format
        //}
        //System.out.println("Average: " + "    Total: ");
        
        
   
    
    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);  //will be used in 6.02
        String city = "Tallahassee";  //choose a city from the table provided
        String state = "FL";  //choose a city from the table provided
  
        String [] month = {"Jan.", "Feb.", "Mar.", "Apr.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec." };     //complete initialization of months array
        double [] temperature ={51.8, 54.8, 61.1, 66.4, 74.4, 80.4, 82.4, 82.1, 78.9, 69.1, 60.4, 53.7};     //complete initialization of temperatures array
        double [] precipitation ={5.4, 4.6, 6.5, 3.6, 5.0, 6.9, 8.0, 7.0, 5.0, 3.3, 3.9, 4.1};     //complete initialization of precipitation array

        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in

        
        //instantiate CityWeatherV2 object
        CityWeatherV2 tallahassee = new CityWeatherV2(month, temperature, precipitation);
              

        //input to decide F/C and in/cm - to be completed in 6.02
        System.out.println("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        String tempInput = in.next(); 
        System.out.println("Choose the precipitation scale (i = inches, c = centimeters): ");
        String precInput = in.next();

        if(tempInput.equalsIgnoreCase("c")) {
            tempLabel = "C";
        }
        if(precInput.equalsIgnoreCase("c")) {
            precipLabel = "cm.";
        }
        
        //conditions & method call to convert temp, if needed - to be completed in 6.02
        if(tempInput.equalsIgnoreCase("c")) {
            for(int i = 0; i < tallahassee.temps.length; i++) {
                tallahassee.temps[i] = tallahassee.tempInC(i);
            }
        }
        
        //conditions & method call to convert prec, if needed - to be completed in 6.02
        if(precInput.equalsIgnoreCase("c")) {
            for(int i = 0; i < tallahassee.precipitation.length; i++) {
                tallahassee.precipitation[i] = tallahassee.precInCm(i);
            }
        }
        
        //method call to calculate the average temperature
        double avgTemp = tallahassee.avgTemp();
        
        //method call to calculate the total precipitation
        double totalPrec = tallahassee.totalPrecipitation();
        
        //method call to print results (hint: Need parameters for month, temperature, precipitation arrays, data labels and the average temperature, total precipitation variables)
        System.out.println("\n              Weather Data");
        System.out.println("        Location: " + city + ", " + state);
        System.out.println("Month       Temperature (" + tempLabel + ")     Precipitation (" + precipLabel + ")\n\n*********************************************************");
        for(int index = 0; index < temperature.length; index++) {
            System.out.printf(" %-15s", month[index]);
            System.out.printf("%-15f", tallahassee.temps[index]);
            System.out.printf("%-15f%n", tallahassee.precipitation[index]);
        }
        System.out.println("*********************************************************");
        System.out.println("        Average: " + avgTemp + "      Annual: " + totalPrec);
    
    
    


    }//end main
}//end class

