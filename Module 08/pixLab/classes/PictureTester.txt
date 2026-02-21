/*
 * Purpose:
 * 
 * Rakesh Raj
 * 3/26/25
*/

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue - Activity 5 */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVerticalRightToLeft ()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
    public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizontal(){
    Picture caterpillar = new Picture("redMotorcycle.jpg");
    caterpillar.mirrorHorizontal();
    caterpillar.explore();      
      
      
  }
  
  public static void testMirrorHorizontalBotToTop(){
    Picture caterpillar = new Picture("redMotorcycle.jpg");
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();      
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms(){
    Picture temple = new Picture("snowman.jpg");
    temple.mirrorArms();
    temple.explore();
  }
  
  public static void testMirrorGull(){
    Picture temple = new Picture("seagull.jpg");
    temple.mirrorGull();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.KeepOnlyBlue();
    beach.explore();
  }
  
  public static void testNegate(){
    Picture beach = new Picture("beach.jpg");
    beach.negate();
    beach.explore();
  }
  
  public static void testGreyscale(){
    Picture beach = new Picture("beach.jpg");
    beach.grayscale();
    beach.explore();      
  }
  
  public static void testFixUnderwater(){
    Picture beach = new Picture("water.jpg");
    beach.fixUnderWater();
    beach.explore();  
  }
  public static void getPicture(){
    Picture beach = new Picture("seagull.jpg");
    beach.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test and 
    // comment out the ones you don't want to run
    
    // Activity 5
    //testZeroBlue();
    
    
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    testGreyscale();
    
    // Activity 5 Challenge - optional
    //testFixUnderwater();
    
    // Activity 6
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBotToTop();
    
    // Activity 6 Challenge - optional
    //testMirrorDiagonal();
    
    // Activity 7
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();

    
    // Activity 8
    //testCollage();
    //testCopy();
    //testMyCollage();
    
    // Activity 9
    //testEdgeDetection();
    //testEdgeDetection2();
    
    // Extra methods
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}












