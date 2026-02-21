
/**
 * The purpose of this program is to read data and determine family composition statistics
 *
 * @author Rakesh Raj
 * @version 07/04/24
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Family
{
    public static void main(String[] args) throws IOException
    {

        String token = "";
        File fileName = new File("familyMembers.txt");
        Scanner inFile = new Scanner(fileName);

        int bb = 0;
        int bg = 0;
        int gg = 0;

        while( inFile.hasNext() )
        {
            token = inFile.next( );
            if(token.equals("BB")) {
                bb++;
            }
            else if(token.equals("BG") || token.equals("GB")) {
                bg++;
            }
            else if(token.equals("GG")){
                gg++;
            }
        }

        inFile.close();

        int total = bb + bg + gg;
        double bbPercentage = (int)((double)bb/total * 1000)/10.0;
        double bgPercentage = (int)((double)bg/total * 1000)/10.0;
        double ggPercentage = (int)((double)gg/total * 1000)/10.0;

        System.out.println("Composition statistics for families with 2 children.\n");
        System.out.println("Total number of families: " + total + "\n");
        System.out.println("Number of families with");
        System.out.println("            2 boys: " + bb + " represents " + bbPercentage + "%");
        System.out.println("           2 girls: " + gg + " represents " + ggPercentage + "%");
        System.out.println("  1 boy and 1 girl: " + bg + " represents " + bgPercentage + "%");

    }
}