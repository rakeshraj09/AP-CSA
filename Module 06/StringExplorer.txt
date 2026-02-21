/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author Rakesh Raj
 * @version 12/8/24
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "    ";

        //  Add examples below for the following methods:
        //    trim()
        String str1 = " Lebron ";
        String newStr1 = str1.trim();
        System.out.println(newStr1);
        //    length()
        String str2 = "Lebron is the GOAT";
        int lenStr2 = str2.length();
        System.out.println("Length: " + lenStr2);
        //    indexOf with one and two parameters
        String str3 = "The GOAT Lebron plays for the GOAT team the Lakers.";
        int inx = str3.indexOf("GOAT", 10);
        System.out.println(inx);
        //    substring() with one and two parameters
        String str4 = "Lebron James is the greatest basketball player of all time.";
        String newStr4 = str4.substring(7, 12);
        System.out.println(newStr4);
        //    compareTo()
        String str5 = "Lebron James";
        int diff = str5.compareTo("Lebron");
        System.out.println("Difference: " + diff);
        //    any other String methods you'd like to try
        String str6 = "LEBRON";
        String newStr6 = str6.toLowerCase();
        System.out.println(newStr6);

    }

}
