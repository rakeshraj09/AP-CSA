/**
 * Randomly generate passwords.
 *
 * @author Rakesh Raj
 * @version 07/06/24
 * 
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SecretPasscode
{
    public static void main(String [] args) throws IOException
    {
        String userChoice = "Y";
        int pwLength = 0;
        int randNum = 0; 
        String password = "";
        int count;

	// initialize scanner and print writer
        Scanner in = new Scanner(System.in);
        File fileName =  new File("passwords.txt");
        PrintWriter outFile = new PrintWriter(fileName);
        Scanner inFile = new Scanner(fileName);

        System.out.println("**********************************************************");
        System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");

        while(userChoice.equalsIgnoreCase("y")) {
                while(pwLength < 6) {
                        System.out.println("Enter a password length (6 or more): ");
                        pwLength = in.nextInt();
                        if(pwLength < 6) {
                                System.out.println("    Password too short. Please try again.");
                        }
                }

                for(int i = 0; i < pwLength; i++) {
                        randNum = (int)(Math.random()*62);
                        if(randNum < 10) {randNum+=48;} //numbers
                        else if(randNum >= 10 && randNum < 36) {randNum+=55;} //uppercase
                        else {randNum+=61;} //lowercase
                        password+=(char)randNum;
                }
                outFile.println(password);
                password = "";
                
                System.out.println("\nA password has been written to the text file.\nWould you like the generate another password?  Y/N ");
                userChoice = in.next();
                pwLength = 0;
        }
	
        outFile.close();

        System.out.println("Thank you for using the Passcode generator.\n\nHere are your randomly generated codes:");
        count = 1;
        while(inFile.hasNext()) {
                System.out.println(count + ". " + inFile.next());
                count++;
        }
  }
}

