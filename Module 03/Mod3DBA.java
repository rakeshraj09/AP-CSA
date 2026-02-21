import java.util.Scanner;
public class Mod3DBA
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name (first last): ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Are you a first responder? (Y/N): ");
        String fresponder = scanner.next();
        System.out.println("Are you a veteran? (Y/N): ");
        String veteran = scanner.next();

        double price;
        if(age > 18) {price = 12.0;}
        else if(age < 3) {price = 2.0;}
        else if(age >= 3 && age <= 5) {price = 9.0;}
        else {price = 11.0;}
        if(fresponder.compareToIgnoreCase("Y") == 0 && age > 18 || veteran.compareToIgnoreCase("Y") == 0 && age > 18) {price*=0.5;}

        String id = name.substring(0,1) + name.substring(name.indexOf(" ")+1) + (int)(Math.random()*1000 + 1);

        printTicket(name, id, price);
    }

    public static void printTicket(String name, String id, double price) {
        System.out.println("Welcome to the APCS Carnival, " + name + "!");
        System.out.println("Your user ID is " + id);
        System.out.println("The cost of your ticket is $" + price + ".");
        System.out.println("Have a great time at the APCS Carnival today!");
    }
}