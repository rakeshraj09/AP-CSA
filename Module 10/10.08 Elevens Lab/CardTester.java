/**
 * This is a class that tests the Card class.
 *
 *  Rakesh Raj
 *  5/11/25
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);
      Card fiveSpades = new Card("five", "Spades", 5);
      Card tenDiamonds = new Card("ten", "Diamonds", 10);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 2: ace of hearts ****");
      System.out.println("  rank: " + fiveSpades.rank());
      System.out.println("  suit: " + fiveSpades.suit());
      System.out.println("  pointValue: " + fiveSpades.pointValue());
      System.out.println("  toString: " + fiveSpades.toString());
      System.out.println();
      // Test card 3
      System.out.println("**** Tests Card 3: ace of hearts ****");
      System.out.println("  rank: " + tenDiamonds.rank());
      System.out.println("  suit: " + tenDiamonds.suit());
      System.out.println("  pointValue: " + tenDiamonds.pointValue());
      System.out.println("  toString: " + tenDiamonds.toString());
      System.out.println();
      // Test matches() method
      System.out.println("**** matches test ****");
      if(aceHearts.matches(fiveSpades)){
         System.out.println("  matching: true");
         System.out.println("  not matching: false");
      }
      else{
         System.out.println("  matching: false");
         System.out.println("  not matching: true");
      }
   }
}
