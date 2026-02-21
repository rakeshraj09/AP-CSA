/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Rakesh Raj
 * @version 06/07/24
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 18.9035916824;     // 1 US dollar = 18.9035916824 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        //remaining variables below here
		double yenSpent = 82395.44;
		double yenExchangeRate = 147.710487445;
		double dollarsSpentInJapan = 0.0;
		double dollarsAfterJapan = 0.0;

		double eurosSpent = 750.82;
		double euroExchangeRate = 0.87237197941;
		double dollarsSpentInSpain = 0.0;
		double dollarsAfterSpain = 0.0;

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
		dollarsSpentInMexico = pesosSpent/pesoExchangeRate;
		dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;

		dollarsSpentInJapan = yenSpent/yenExchangeRate;
		dollarsAfterJapan = dollarsAfterMexico - dollarsSpentInJapan;

		dollarsSpentInSpain = eurosSpent/euroExchangeRate;
		dollarsAfterSpain = dollarsAfterJapan - dollarsSpentInSpain;
        // code goes below here
		System.out.println("Starting US dollars:	  " + startingUsDollars);
		System.out.println();
		System.out.println("Mexico:");
		System.out.println(" Pesos Spent:       	  " + pesosSpent);
		System.out.println(" US dollars equivalent:   " + dollarsSpentInMexico);
		System.out.println(" US dollars remaining:	  " + dollarsAfterMexico);
		System.out.println();
		System.out.println("Japan:");
		System.out.println(" Yen Spent:       	  " + yenSpent);
		System.out.println(" US dollars equivalent:   " + dollarsSpentInJapan);
		System.out.println(" US dollars remaining:	  " + dollarsAfterJapan);
		System.out.println();
		System.out.println("Spain:");
		System.out.println(" Pesos Spent:       	  " + eurosSpent);
		System.out.println(" US dollars equivalent:   " + dollarsSpentInSpain);
		System.out.println(" US dollars remaining:	  " + dollarsAfterSpain);
		System.out.println("=====================================");
		System.out.println("Remaining US dollars:     " + dollarsAfterSpain);
		System.out.println();
		System.out.println();


        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  						//cost per item of first souvenir
		int budget1 = 100;   						//budget for first item
		int totalItems1 = budget1/costItem1; 	//how many items can be purchased
		int fundsRemaining1 = budget1  % costItem1;  	//how much of the budget is left\

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  (int)totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		double totalItems2 = budget2/costItem2; 	//how many items can be purchased
		double fundsRemaining2 = (double)budget2 % costItem2;  	//how much of the budget is left\

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  (int)totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

