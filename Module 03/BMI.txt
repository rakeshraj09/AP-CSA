/**
 * Purpose: Calculate BMI and weight status based on inputted weight and height
 * 
 * @author Rakesh Raj
 * @version 06/13/24
 */ 

import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name (first last): ");
        String name = scanner.nextLine();
        System.out.println("Enter your weight in pounds: ");
        int weightPounds = scanner.nextInt();
        System.out.println("Enter your height in feet and inches: ");
        int feet = scanner.nextInt();
        int inches = scanner.nextInt();

        double weightKg = weightPounds * 0.453592;
        double heightM = ((feet*12 + inches) * 2.54)/100;
        double bmi = weightKg/Math.pow(heightM, 2);
        weightKg = (int)(10*weightKg)/10.0;
        heightM = (int)(10*heightM)/10.0;
        bmi = (int)(10*bmi)/10.0;

        String status;
        if(bmi < 18.5) {
            status = "Underweight";
        }
        else if(bmi >= 18.5 || bmi <= 24.9) {
            status = "Normal or Healthy Weight";
        }
        else if(bmi >= 25.0 || bmi <= 29.9) {
            status = "Overweight";
        }
        else {
            status = "Obese";
        }

        System.out.println();
        System.out.println("Body Mass Index Calculator\n===========================");
        System.out.println("Name: " + name);
        System.out.println("Height (m): " + heightM);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("BMI: " + bmi);
        System.out.println("Category: " + status);
    }
}
