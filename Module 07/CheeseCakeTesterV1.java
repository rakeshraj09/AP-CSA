/**
 * @calculate and print the necessary amounts of ingredients and data for various cheesecakes
 *
 * @author Rakesh Raj
 * @version 1/24/25
 *
 */
import java.util.ArrayList;

public class CheeseCakeTesterV1
{
    public static void main(String[] args)
    {
        //initializing and declareing an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
        cake.add(new CheeseCakeV1("Blueberry", 2));
        cake.add(new CheeseCakeV1("Mango", 6));
        cake.add(new CheeseCakeV1("Strawberry", 1));
        cake.add(new CheeseCakeV1("Caramel", 4));
        cake.add(new CheeseCakeV1("Banana", 1));
        cake.add(new CheeseCakeV1("Chocolate", 5));
        
        //calls several method for each object to perform calculations
        for(CheeseCakeV1 dataRecord : cake)
        {
            dataRecord.calcCreamCheese();
            dataRecord.calcTotalServings();
            dataRecord.calcSugar();
            dataRecord.calcVanilla();
        }
        
        //printing the format of the table
        System.out.println(" |       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println(" | Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println(" |-------|----------|---------------|--------------|----------|-----------|-----------|");

        CheeseCakeV1 dataRecord;
        
        //using a for loop to print out the objects' data
        for(int index = 0; index < cake.size(); index ++)
        {
            System.out.printf(" |%4d   ", index);
            System.out.println(cake.get(index).toString());
        }
    }
}
