/**
 * The purpose of this program is to calculate the average test score
 * 
 * @author Rakesh Raj
 * @version 06/07/24
 */
public class GradesV2
{
    public static void main(String[ ] args)
    {
        //local variables       
        int numTests = 0;
        int testGrade = 0;
        int totalPoints = 0;
        double average = 0.0;

        testGrade = 95;
        totalPoints+=testGrade;
        numTests++;
        average = (double)totalPoints/numTests;
        System.out.println("Test # 1  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);

        testGrade = 73;
        totalPoints+=testGrade;
        numTests++;
        average = (double)totalPoints/numTests;
        System.out.println("Test # 2  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);

        testGrade = 91;
        totalPoints+=testGrade;
        numTests++;
        average = (double)totalPoints/numTests;
        System.out.println("Test # 3  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);

        testGrade = 82;
        totalPoints+=testGrade;
        numTests++;
        average = (double)totalPoints/numTests;
        System.out.println("Test # 4  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);

        // additional test scores

        System.out.println();
        System.out.println("Additional Test Scores");
        System.out.println();

        testGrade = 85;
        totalPoints+=testGrade;
        numTests++;
        average = (double)totalPoints/numTests;
        System.out.println("Test # 5  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);

        testGrade = 72;
        totalPoints+=testGrade;
        numTests++;
        average = (double)totalPoints/numTests;
        System.out.println("Test # 6  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);

        testGrade = 96;
        totalPoints+=testGrade;
        numTests++;
        average = (double)totalPoints/numTests;
        System.out.println("Test # 7  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);

        testGrade = 95;
        totalPoints+=testGrade;
        numTests++;
        average = (double)totalPoints/numTests;
        System.out.println("Test # 8  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);

        testGrade = 66;
        totalPoints+=testGrade;
        numTests++;
        average = (double)totalPoints/numTests;
        System.out.println("Test # 9  Test Grade: " + testGrade + "  Total Points: " + totalPoints + "  Average Score: " + average);
    }//end of main method
}//end of class