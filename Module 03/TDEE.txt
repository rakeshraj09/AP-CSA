/**
 * Purpose: Calculate TDEE based on BMR and activity level
 * 
 * @author Rakesh Raj
 * @version 06/26/24
 */ 

import java.util.Scanner;
public class TDEE
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name (first last): ");
        String name = scanner.nextLine();
        System.out.println("Enter your BMR: ");
        double bmr = scanner.nextDouble();
        System.out.println("Enter your gender (M/F): ");
        String gender = scanner.next();
        System.out.println("\nSelect Your Activity Level\n[A] Resting\n[B] Sedentary\n[C] Light\n[D] Moderate\n[E] Very Active\n[F] Extremely Active\nEnter the letter corresponding to your activity level: ");
        String activityLevel = scanner.next();
        
        double activityFactor;
        if(activityLevel.equalsIgnoreCase("a")) {
            activityFactor = 1.0;
        }
        else if(activityLevel.equalsIgnoreCase("b")) {
            activityFactor = 1.3;
        }
        else if(activityLevel.equalsIgnoreCase("c") && gender.equalsIgnoreCase("m")) {
            activityFactor = 1.6;
        }
         else if(activityLevel.equalsIgnoreCase("c") && gender.equalsIgnoreCase("f")) {
            activityFactor = 1.5;
        }
        else if(activityLevel.equalsIgnoreCase("d") && gender.equalsIgnoreCase("m")) {
            activityFactor = 1.7;
        }
         else if(activityLevel.equalsIgnoreCase("d") && gender.equalsIgnoreCase("f")) {
            activityFactor = 1.6;
        }
        else if(activityLevel.equalsIgnoreCase("e") && gender.equalsIgnoreCase("m")) {
            activityFactor = 2.1;
        }
         else if(activityLevel.equalsIgnoreCase("e") && gender.equalsIgnoreCase("f")) {
            activityFactor = 1.9;
        }
        else {
            if(gender.equalsIgnoreCase("m")) {
                activityFactor = 2.4;
            }
            else {activityFactor = 2.2;}
        }

        double tdee = bmr*activityFactor;
        System.out.println("\nYour results:\nName: " + name + "                 Gender: " + gender + "\nBMR: " + bmr + " calories      Activity Factor: " + activityFactor + "\nTDEE: " + tdee);
    }
}
