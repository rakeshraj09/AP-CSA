public class Calc
{
    public static void main(String [] args)
    {

        int value = 15;
        //calculation and output statements
        int wholeValueDivBy2 = value/2;
        int remainder = value % 2;
        double decimalValueDivBy2 = (double)value/2;

        System.out.println("The original value is " + value + ".");
        System.out.println("When " + value + " is divided by 2, the whole number result is " + wholeValueDivBy2 + ".");
        System.out.println("The remainder of " + value + " divided by 2 is " + remainder + ".");
        System.out.println("When " + value + " is divided by 2, the decimal result is " + decimalValueDivBy2 + ".");
    }
}