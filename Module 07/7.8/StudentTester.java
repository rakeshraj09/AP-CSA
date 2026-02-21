/**
 * Purpose:  This class creates Student objects and prints their quiz results
 *
 * @author Rakesh Raj
 * @version 2/17/25
 */
import java.util.*;

public class StudentTester
{
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Tom Brady", new int[]{91, 88, 72, 95, 84}));
        students.add(new Student("Jalen Hurts", new int[]{65, 82, 83, 97, 76}));
        students.add(new Student("Jared Goff", new int[]{99, 89, 90, 71, 86}));
        students.add(new Student("Baker Mayfield", new int[]{90, 57, 75, 81, 79}));
        students.add(new Student("Jayden Daniels", new int[]{96, 85, 100, 88, 94}));
        System.out.println("Starting Gradebook:\n");
        printResults(students);
        changeName(students, "Jalen Hurts", "Jordan Love");
        printResults(students);
        changeGrade(students, "Jayden Daniels", 2, 90);
        printResults(students);
        replaceStudent(students, "Jared Goff", "Bryce Young", new int[]{94, 66, 83, 75, 86});
        printResults(students);
        insertStudent(students, "Baker Mayfield", "Josh Allen", new int[]{98, 92, 89, 80, 85});
        printResults(students);
        deleteStudent(students, "Jayden Daniels");
        printResults(students);
    }

    static void printResults(List<Student> myStudents) {
        System.out.println("Student name      Q1     Q2     Q3     Q4     Q5\n-----------------------------------------------------");
        for(int i = 0; i < myStudents.size(); i++) {
            System.out.println(myStudents.get(i).toString());
        }
    }

    static void changeName(List<Student> myStudents, String find, String replacement) {
        for(int i = 0; i < myStudents.size(); i++) {
            if(myStudents.get(i).getName().equals(find)) {
                myStudents.get(i).setName(replacement);
            }
        }
        System.out.printf("<<Changing %s to %s>>%n%n", find, replacement);
    }

    static void changeGrade(List<Student> myStudents, String find, int quizN, int replacement) {
        for(int i = 0; i < myStudents.size(); i++) {
            if(myStudents.get(i).getName().equals(find)) {
                myStudents.get(i).setQuizScore(quizN, replacement);
            }
        }
        System.out.printf("<<Changing %s quiz %d grade to %d>>%n%n", find, quizN, replacement);
    }

    static void replaceStudent(List<Student> myStudents, String find, String newName, int[] newScores) {
        for(int i = 0; i < myStudents.size(); i++) {
            if(myStudents.get(i).getName().equals(find)) {
                myStudents.get(i).setName(newName);
                for(int j = 0; j < newScores.length; j++) {
                    myStudents.get(i).setQuizScore(j+1, newScores[j]);
                }
            }
        }
        System.out.printf("<<Replacing %s with new student %s>>%n%n", find, newName);
    }

    public static void insertStudent(List<Student> myStudents, String find, String name, int[] grades) {
        int pos = 0;
        for(int i = 0; i < myStudents.size(); i++)
            if(myStudents.get(i).getName().equals(find))
                pos = i;

        myStudents.add(pos, new Student(name, grades));

        System.out.printf("<<Before %s, add %s>>%n%n", find, name);
    }

    static void deleteStudent(List<Student> myStudents, String find) {
        int pos = 0;
        int i;
        for(i = 0; i < myStudents.size(); i++)
        {
            if((myStudents.get(i).getName().equals(find)))
            {
                pos = i;
                break;
            }
        }
        if(i != myStudents.size()) {
            myStudents.remove(pos);
        }

        System.out.printf("<<Delete %s>>%n%n", find);
    }
}
