/**
 * Annual Weather object class
 * 
 * @author Rakesh Raj
 * @version 10/20/24
 */

public class CityWeatherV2 {
    // private instance variables - three arrays
    String[] months = {};
    double[] temps = {};
    double [] precipitation = {};

    // constructor with parameters
    CityWeatherV2(String[] months1, double[] temps1, double[] precipitation1) {
        months = months1;
        temps = temps1;
        precipitation =  precipitation1;
    }

    // setters and getters for each private instance variable
    public String[] getMonths() {
        return months;
    }
    public double[] getTemps() {
        return temps;
    }
    public double[] getPrec() {
        return precipitation;
    }

    public void setMonths(String[] newMonths) {
        months = newMonths;
    }
    public void setTemps(double[] newTemps) {
        temps = newTemps;
    }
    public void setPrec(double[] newPrec) {
        precipitation = newPrec;
    }


    // method to calculate the average of temperature
    public double avgTemp() {
        double totalTemp = 0;
        for(double temp : temps) {
            totalTemp += temp;
        }
        return (int)(10*totalTemp/12)/10.0;
    }
      
    // method to calculate total precipitation array
    public double totalPrecipitation() {
        double totalPrec = 0;
        for(double prec : precipitation) {
            totalPrec += prec;
        }
        return (int)(10*totalPrec)/10.0;
    }
 
        
        

    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    public double tempInC(int index) {
        return (int)((10*temps[index]-32)*5.0/9)/10.0;
    }
    
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02
    public double precInCm(int index) {
        return (int)(10*precipitation[index]*2.54)/10.0;
    }


}
