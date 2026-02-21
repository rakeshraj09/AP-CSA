
/**
 * This class defines a Cylinder object by extending a Circle.
 *
 * @author Rakesh Raj
 * @version 4/2/25
 */

public class Cylinder2 extends Circle2
{
    // instance variables
    private int height;

    // Constructor for objects of class Cylinder
    public Cylinder2(int x, int y, int rad, int h)
    {
        // call superclass
        super(x, y, rad);

        // initialize instance variables
        height = h;
    }

    public int getHeight()
    {
        return height;
    }
    public String getName(){
        return "Cylinder";
    }
}

