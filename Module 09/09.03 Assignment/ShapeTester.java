import java.util.ArrayList;
import java.lang.reflect.Array;
/**
 * This class demonstrates polymorphism with
 * object declarations and the static method
 * to print values.
 *
 * @author Rakesh Raj
 * @version 4/2/25
 */
import java.util.*;

public class ShapeTester {

    public static void showCenter(ArrayList<Circle2> shapes){
        for (Circle2 i: shapes){
            System.out.println("For this " + i.getName()+" the "+i.getCenter());
        }

    }
    public static void main(String[] args) {
        ArrayList<Circle2> shapes = new ArrayList<Circle2>();
        shapes.add(new Circle2(2, 4, 8));
        shapes.add(new Oval2(10, 15, 8, 4));
        shapes.add(new Cylinder2(25, 10, 8, 16));
        shapes.add(new OvalCylinder2(40, 10, 8, 4, 16));

        showCenter(shapes);
    }
}

