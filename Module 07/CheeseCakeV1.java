/**
 * @define a cheesecake object
 *
 * @author Rakesh Raj
 * @version 1/24/25
 *
 */
public class CheeseCakeV1
{
    private int myQuantity, myServings, myCreamCheese, myVanilla;
    private double mySugar;
    private String myFlavor;
    
   /**
    * Constructor for objects of type CheeseCakeV1
    * @param flavor
    * @param quantity
    */
    CheeseCakeV1(String flavor,int quantity)
    {
        myFlavor = flavor;
        myQuantity = quantity;
    }

    /**
     * Mutator method to calculate the number of servings
     */
    public void calcTotalServings()
    {
        myServings = 16*myQuantity;
    }

    /**
     * Mutator method to calculate the Cream Cheese Needed
     */
    public void calcCreamCheese()
    {
        myCreamCheese = 32*myQuantity;
    }

    /**
     * Mutator method to calculate the Vanilla Needed
     */
    public void calcVanilla()
    {
        myVanilla = myQuantity;
    }

    /**
     * Mutator method to calculate the Sugar Needed
     */
    public void calcSugar()
    {
        mySugar = myQuantity/3.0;
    }    

    /**
     * Getter method to return the number of cakes (no parameters)
     */
    public int getquantity()
    {
        return myQuantity;
    }

    /**
     * Getter method to return flavor of the cake (no parameters)
     */
    public String getFlavor()
    {
        return myFlavor;
    }

    /**
     * Getter method to return amount of Sugar needed (no parameters)
     */
    public double getSugar()
    {
        return mySugar;
    }

    /**
     * Getter method to return amount of Cream Cheese needed (no parameters)
     */
    public int getCreamCheese()
    {
        return myCreamCheese;
    }

    /**
     * Getter method to return amount of Vanilla needed (no parameters)
     */
    public int getVanilla()
    {
        return myVanilla;
    }

    /**
     * Getter method to return number of Servings (no parameters)
     */
    public int getServings()
    {
        return myServings;
    }
    
    public String toString()
    {
        //******* Practice your printf() skills by formatting this data! ****//
        return String.format("|%5d     | %-14s|%5d oz      | %5d    |  %.2f cups|%4d tsps  |", myQuantity, myFlavor, myCreamCheese, myServings, mySugar, myVanilla);
    }
}