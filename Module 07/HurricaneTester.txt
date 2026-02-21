/**
 * Starter code for the Hurricane Tester
 * 
 * @author Rakesh Raj
 * @version 2/2/2025
 * 
 */
 
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class HurricaneTester

{

    public static void main(String[] args) throws IOException
    {
        //read data from text file & put in an array
        File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        
        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        
        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];
        
        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();
        
		//create an array to store the categories for each hurricane
        int[] cats = new int[numValues];		
		
		//convert the values in the windspeed array to MPH, use the converted windspeeds to fill the categories array
        for(int i = 0; i < numValues; i++) {
            windSpeeds[i]*=1.151; //convert to mph
            if(windSpeeds[i]>=74 && windSpeeds[i]<96) {
                cats[i] = 1;
            }
            else if(windSpeeds[i]>=96  && windSpeeds[i]<111) {
                cats[i] = 2;
            }
            else if(windSpeeds[i]>=111  && windSpeeds[i]<130) {
                cats[i] = 3;
            }
            else if(windSpeeds[i]>=130  && windSpeeds[i]<157) {
                cats[i] = 4;
            }
            else {
                cats[i] = 5;
            }
        }
		
		//user prompted for range of years
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the range of years (start end)- ");
        int minYear = in.nextInt();
        int maxYear = in.nextInt();
        while(minYear<1995 || maxYear>2019) {
            System.out.println("Please enter a valid range.");
            minYear = in.nextInt();
            maxYear = in.nextInt();
        }
        
		//create a Hurricane ArrayList of hurricane objects
        Hurricane[] hurricanes = new Hurricane[numValues];
        for(int i = 0; i < numValues; i++) {
            hurricanes[i] = new Hurricane(years[i], names[i], months[i], cats[i], pressures[i], windSpeeds[i]);
        }

		//print the hurricanes in the user's requested range
        double avgC = 0, avgP = 0, avgS = 0;
        int minC = Integer.MAX_VALUE, minP = Integer.MAX_VALUE;
        int maxC = Integer.MIN_VALUE, maxP = Integer.MIN_VALUE;
        double minS = Double.MAX_VALUE;
        double maxS = Double.MIN_VALUE;
        int count = 0;
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;
        System.out.printf("                     Hurricanes %-4d - %-4d %nYear       Hurricane    Category     Pressure (mb)         Wind Speed (mph)%n==============================================================================%n", minYear, maxYear);
        for(Hurricane hurricane : hurricanes) {
            if(hurricane.getYear()>=minYear && hurricane.getYear()<=maxYear) {
                System.out.println(hurricane.toString());

                //calculate avg/min/max
                avgC+=hurricane.getCat();
                avgP+=hurricane.getPressure();
                avgS+=hurricane.getWindspeed();
                if(hurricane.getCat() < minC) {minC = hurricane.getCat();}
                else if(hurricane.getCat() > maxC) {maxC = hurricane.getCat();}

                if(hurricane.getPressure() < minP) {minP = hurricane.getPressure();}
                else if(hurricane.getPressure() > maxP) {maxP = hurricane.getPressure();}

                if(hurricane.getWindspeed() < minS) {minS = hurricane.getWindspeed();}
                else if(hurricane.getWindspeed() > maxS) {maxS = hurricane.getWindspeed();}

                if(hurricane.getCat() == 1) {c1++;}
                else if(hurricane.getCat() == 2) {c2++;}
                else if(hurricane.getCat() == 3) {c3++;}
                else if(hurricane.getCat() == 4) {c4++;}
                else {c5++;}

                count++;
            }
        }
        avgC/=count;
        avgP/=count;
        avgS/=count;

        //display the summary data using the ArrayList
        System.out.printf("==============================================================================%n       Average:           %.1f        %.1f                   %.2f%n       Minimum: %12d%12d                     %.2f%n       Maximum: %12d%12d                     %.2f%n%nSummary of Categories:%n   Cat 1: %2d%n   Cat 2: %2d%n   Cat 3: %2d%n   Cat 4: %2d%n   Cat 5: %2d", avgC, avgP, avgS, minC, minP, minS, maxC, maxP, maxS, c1, c2, c3, c4, c5);

     }
}