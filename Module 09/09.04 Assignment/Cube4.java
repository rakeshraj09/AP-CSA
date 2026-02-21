/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Rakesh Raj
 * @version 4/2/25
 */
public class Cube4 extends Box4
{

    private int height;
    // Constructor for objects of class Box
    public Cube4(int l, int w, int h)
    {
        // call superclass
        super(l, w, h);

        height=h;
    }

    // String to display when object is printed.
    
    public String toString()
    {
        return "Cube " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
    
}

