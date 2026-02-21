/**
 * Purpose: Prompt user with instructions to purchase tickets for a football game and calculate total cost of tickets based on given information
 *
 * @author Rakesh Raj
 * @version 06/11/24
 */ 
import java.util.Scanner;

public class BuyFootballGameTickets
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Good Evening.\nPlease enter your first and last name: ");
        String firstName = scanner.next();
        String lastName = scanner.next();
        System.out.println();

        System.out.print("Enter today's date (mm/dd/yyyy): ");
        String date = scanner.next();
        System.out.println();
        
        String newLine = scanner.nextLine();
        System.out.print("Which football game would you like to see? ");
        String game = scanner.nextLine();
        System.out.println();

        System.out.print("How many tickets? ");
        int tickets = scanner.nextInt();
        System.out.println();

        System.out.print("What is the ticket price? ");
        double ticketPrice = scanner.nextDouble();
        System.out.println();

        System.out.print("Enter your debit card number (#####-###-####): ");
        String debitCardNumber = scanner.next();
        System.out.println();

        System.out.print("Enter your PIN (#####): ");
        String pinNumber = scanner.next();

        System.out.println("=======================================================");
        System.out.println("=======================================================");

        System.out.println("Your e-Receipt\n");
        System.out.println(date);
        String orderNumber = firstName.substring(0,1) + lastName.substring(0,1) + date.substring(0,2) + pinNumber.substring(0,1);
        System.out.println("Order number: " + orderNumber + "\n");
        System.out.println(firstName.substring(0,1) + ".\t" + lastName);
        System.out.println("Account: #####-###-" + debitCardNumber.substring(debitCardNumber.length()-4, debitCardNumber.length()));
        System.out.println("Movie: " + game);
        System.out.println("Number of Tickets: " + tickets);
        System.out.println("Ticket Price: " + ticketPrice + "\n");
        double totalPrice = ticketPrice*tickets;
        System.out.println("$" + totalPrice + " will be debited to your account.\n");
        System.out.println("Thank you. Enjoy the game.");
    }
}
