/**
 * Purpose:  This class defines a Student object
 *
 * @author Rakesh Raj
 * @version 2/17/25
 */

public class Student
{
    // instance variables
    private String name;
    private int[] quizScores =  new int[5];

    // Constructor for objects of class Candidate
    public Student(String name, int[] quizScores)
    {
        this.name = name;
        this.quizScores = quizScores;
    }

    public String getName()
    {
        return name;
    }

    public int getQuizScore(int quizN)
    {
        return quizScores[quizN-1];
    }

    public void setQuizScore(int quizN, int newScore)
    {
        quizScores[quizN-1] = newScore;
    }

    public void setName(String n)
    {
        name = n;
    }

    public String toString()
    {
        return String.format("%-17s %-6d %-6d %-6d %-6d %-6d", name, quizScores[0], quizScores[1], quizScores[2], quizScores[3], quizScores[4]);
    }
}
