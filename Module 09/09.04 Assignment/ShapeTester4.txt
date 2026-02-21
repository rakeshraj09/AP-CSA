import java.util.ArrayList;
import java.lang.reflect.Array;
/**
 * This class demonstrates overriding with
 * object declarations and the static method
 * to print values.
 *
 * @author Rakesh Raj
 * @version 4/2/25
 */
import java.util.*;

public class ShapeTester4 {

    public static void Print(ArrayList<Rectangle4> shapes){
        for (Rectangle4 i: shapes){
            showEffect(i);
        }

    }
    public static void compare(ArrayList<Rectangle4> shapes, int i, int j){
        if(shapes.get(i).equals().equals(shapes.get(j).equals())){
            System.out.println(shapes.get(i)+" IS the same size as " + shapes.get(j)+"\n");
        }
        else{
            System.out.println(shapes.get(i)+" is NOT the same size as " + shapes.get(j)+"\n");

        }
    }
    public static void main(String[] args) {
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();
        shapes.add(new Rectangle4(12, 20));
        shapes.add(new Box4(4, 4, 4));
        shapes.add(new Box4(4, 12, 8));
        shapes.add(new Cube4(4, 4, 4));
        shapes.add(new Rectangle4(12, 1));
        shapes.add(new Box4(18, 1, 1));

        System.out.println("My shapes:\n");
        Print(shapes);
        System.out.println("\nTest for Equality:\n");
        compare(shapes, 1, 3);
        compare(shapes, 2, 3);

    }

    public static void showEffect(Rectangle4 r)
    {
        System.out.println(r);
    }
}

